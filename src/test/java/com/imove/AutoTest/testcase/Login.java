package com.imove.AutoTest.testcase;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Login {

	String Url="http://192.168.100.211:8005/login;jsessionid=02D29A101C6F5BE9A6998CF031C6DA5D?service=http://192.168.100.211:8001/cas";
	

	@Test
	@Parameters({ "Cookie", "runenvironment" })
	public void testlogin(String Cookie,String runenvironment) {
		/*UrlLib.doPost(request, url, param);*/
		System.out.println("Cookie:"+Cookie);
		System.out.println("runenvironment:"+runenvironment);
	}
	

	@Test
	@Parameters({ "Cookie", "runenvironment" })
	public void Logout(String Cookie,String runenvironment) {
		System.out.println("Cookie:"+Cookie);
		System.out.println("runenvironment:"+runenvironment);
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
