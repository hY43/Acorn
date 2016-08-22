package kr.co.test.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.test.app.vo.DeptVO;

public class OracleDAO implements Dao{
   //DB에 연결하기 
   Connection conn;
   StringBuffer sb = new StringBuffer();
   ResultSet rs;
   PreparedStatement pstmt;
   
   //초기화 메서드에서 connection 연결
   public void init(){
      String driver ="oracle.jdbc.driver.OracleDriver";
      String url = "jdbc:oracle:thin:@192.168.0.74:1521:orcl";
      String user="scott";
      String password = "tiger";
      
      try {
         Class.forName(driver);
         conn = DriverManager.getConnection(url, user, password);
      } catch (ClassNotFoundException e) {
         System.out.println("driver연결 실패");
         e.printStackTrace();
      } catch (SQLException e) {
         System.out.println("DB 연결 실패");
         e.printStackTrace();
      }
   }
   
   @Override
   public ArrayList<DeptVO> selectAll() {
      ArrayList<DeptVO> list = new ArrayList<DeptVO>();
      
      sb.setLength(0);
      sb.append("SELECT * FROM dept ");
      
      try {
         pstmt = conn.prepareStatement(sb.toString());
         rs = pstmt.executeQuery();
         while(rs.next()){
            int deptno = rs.getInt("deptno");
            String dname = rs.getString("dname");
            String loc = rs.getString("loc");
            DeptVO vo = new DeptVO(deptno, dname, loc);
            list.add(vo);
         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return list;
   }

   @Override
   public DeptVO selectOne(int no) {
      sb.setLength(0);
      sb.append("SELECT * FROM dept ");
      sb.append("WHERE deptno = ? ");
      DeptVO vo = null;
      try {
         pstmt = conn.prepareStatement(sb.toString());
         pstmt.setInt(1, no);
         rs = pstmt.executeQuery();
         rs.next();
         String dname = rs.getString("dname");
         String loc = rs.getString("loc");
         vo = new DeptVO(no, dname, loc);
         
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return vo;
   }

   @Override
   public void insertOne(DeptVO vo) {
      sb.setLength(0);
      sb.append("INSERT INTO dept ");
      sb.append("VALUES(?,?,?) ");
      
      try {
         pstmt = conn.prepareStatement(sb.toString());
         pstmt.setInt(1, vo.getDeptno());
         pstmt.setString(2, vo.getDname());
         pstmt.setString(3, vo.getLoc());
         
         pstmt.executeUpdate();
         
         
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }

   @Override
   public void updateOne(DeptVO vo) {
      sb.setLength(0);
      sb.append("UPDATE dept ");
      sb.append("SET dname = ?, loc = ? ");
      sb.append("WHERE deptno = ? ");
      
      try {
         pstmt = conn.prepareStatement(sb.toString());
         pstmt.setString(1, vo.getDname());
         pstmt.setString(2, vo.getLoc());
         pstmt.setInt(3, vo.getDeptno());
         
         pstmt.executeUpdate();
      } catch (SQLException e) {
         e.printStackTrace();
      }
      
   }

   @Override
   public void deleteOne(int no) {
      sb.setLength(0);
      sb.append("DELETE dept ");
      sb.append("WHERE deptno = ? ");
      
      try {
         pstmt = conn.prepareStatement(sb.toString());
         pstmt.setInt(1, no);
         pstmt.executeUpdate();
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
   
   public void close(){
      try {
         if(rs !=null)rs.close();
         if(rs !=null)pstmt.close();
         if(rs !=null)conn.close();
      } catch (SQLException e) {
         e.printStackTrace();
      }
      
   }//close() end

}