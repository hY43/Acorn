package dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ConnectionManager {
	static ConnectionManager cm;
	private ConnectionManager(){}
	
	public static ConnectionManager getInstance(){
		if(cm==null) cm = new ConnectionManager();
		return cm;
	}
	
	public SqlSessionFactory getFactory(){
		SqlSessionFactory factory = null;
		try {
			Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			factory = ssfb.build(r);
			r.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return factory;		
	}
}
