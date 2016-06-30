package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.ProductVO;

public class ProductDAO {

	private String driver = "oracle.jdbc.driver.OracleDriver"; 
	private String url = "jdbc:oracle:thin:@192.168.0.42:1521:orcl"; 
	private String user = "scott";
	private String password = "tiger";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private StringBuffer sb = new StringBuffer();

	public ProductDAO() {

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn : " + conn);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<ProductVO> selectAll() {
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		sb.setLength(0);
		sb.append("SELECT pno, pname, price, quantity, imgfile, pdesc ");
		sb.append("FROM (SELECT pno, pname, price, quantity, imgfile, pdesc FROM product ORDER BY pno DESC) ");
		sb.append("WHERE ROWNUM <= 20");

		try {
			pstmt = conn.prepareStatement(sb.toString());

			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int pNo = rs.getInt("pno");
				String pName = rs.getString("pname");
				int price = rs.getInt("price");
				int quantity = rs.getInt("quantity");
				String imgFile = rs.getString("imgfile");
				String pDesc = rs.getString("pdesc");
				ProductVO vo = new ProductVO(pNo, pName, price, quantity, imgFile, pDesc);
				list.add(vo);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}
	public ProductVO selectOne(int no){
		sb.setLength(0);
		ProductVO vo = null;
		sb.append("SELECT pname, price, quantity, imgfile, pDesc FROM product WHERE pno=?");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				String pName = rs.getString("pname");
				int price = rs.getInt("price");
				int quantity = rs.getInt("quantity");
				String imgFile = rs.getString("imgfile");
				String pDesc = rs.getString("pdesc");
				vo = new ProductVO(no, pName, price, quantity, imgFile, pDesc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	}
	public void insertOne(ProductVO vo){
		sb.setLength(0);
		sb.append("INSERT INTO product ");
		sb.append("VALUES(product_pno_seq.nextval, ?, ?, ?, ?");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getPname());
			pstmt.setInt(2, vo.getPrice());
			pstmt.setInt(3, vo.getQuantity());
			pstmt.setString(4, vo.getImgfile());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
