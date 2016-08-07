package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.PhotoSearchVO;

public class PhotoSearchDAO {
	private ResultSet rs;
	private PreparedStatement pstmt;
	private StringBuffer sb = new StringBuffer();
	private Connection conn;

		public PhotoSearchDAO(){
			conn = MakeConnection.getInstance().getConnection();
			System.out.println(conn);
		}
		
		public ArrayList<PhotoSearchVO> selectAll(){
			ArrayList<PhotoSearchVO> list = new ArrayList<PhotoSearchVO>();
			PhotoSearchVO vo = null;
			sb.setLength(0);
			sb.append("SELECT name, imgpath FROM photosearch");
		
			try {
				pstmt = conn.prepareStatement(sb.toString());
				rs = pstmt.executeQuery();
				
				while(rs.next()){
					String name = rs.getString("name");
					String imgPath = rs.getString("imgpath");
					vo = new PhotoSearchVO(name, imgPath);
					list.add(vo);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}
		public PhotoSearchVO selectOne(String name){
			PhotoSearchVO vo = null;
			sb.setLength(0);
			sb.append("SELECT imgpath ");
			sb.append("FROM photosearch ");
			sb.append("WHERE name = ? ");
			
			try {
				pstmt = conn.prepareStatement(sb.toString());
				pstmt.setString(1, name);
				rs = pstmt.executeQuery();
				if(rs.next()){
					String imgPath = rs.getString("imgpath");
					
					vo = new PhotoSearchVO(name, imgPath);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return vo;
		}
}
