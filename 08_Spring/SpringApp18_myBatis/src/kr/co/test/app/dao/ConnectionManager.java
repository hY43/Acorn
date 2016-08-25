package kr.co.test.app.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ConnectionManager {
	static SqlSessionFactory factory;
	static {
		try {
			Reader r = Resources.getResourceAsReader("resource/sqlMapConfig.xml");
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			factory = ssfb.build(r);
			r.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // static Block End
	
	public static SqlSessionFactory getFactory(){
		return factory;
	}
}
