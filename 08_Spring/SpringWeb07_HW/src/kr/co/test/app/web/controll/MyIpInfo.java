package kr.co.test.app.web.controll;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyIpInfo {
	public static String getMyIp(){
		InetAddress ip = null;
		String localhost = null; 
		try {
			ip = InetAddress.getLocalHost();
			localhost = ip.getHostAddress(); 
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return localhost;
	}
}
