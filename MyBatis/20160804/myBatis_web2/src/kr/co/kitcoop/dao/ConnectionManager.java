package kr.co.kitcoop.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


// 싱글톤 객체
public class ConnectionManager {
	private static ConnectionManager cm = new ConnectionManager();	
	private SqlSessionFactory factory = null;

	private ConnectionManager(){}
	
	public static ConnectionManager getInstance(){
		return cm;
	}
	
	public SqlSessionFactory getFactory(){
		if(factory == null){
			try {
				Reader r = Resources.getResourceAsReader("kr/co/kitcoop/config/SqlMapConfig.xml");
				SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
				factory = ssfb.build(r);
				r.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return factory;
	}
}
