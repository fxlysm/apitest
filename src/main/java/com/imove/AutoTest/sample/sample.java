package com.imove.AutoTest.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class sample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println(HttpRequestGet());
		
	}

	
	public static String HttpRequestGet() throws IOException {
		
		String urlPath = "http://192.168.100.211:8001/common/main";
		String cookie = "sid=b16398a4-72aa-486a-bab6-665e1d16f723; CASTGC=TGT-90-cCPsbT0a2zSwRZqklHFIrIbwX1QTgyS97S2dAd2GQKteyxG0jI-cas01.example.org; JSESSIONID=FB947E5E0E90769667D1C162C1B81A92";
		URL url = new URL(urlPath);
		URLConnection conn = url.openConnection();
		conn.setRequestProperty("Cookie", cookie);
		conn.setDoInput(true);
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		StringBuilder sb = new StringBuilder();
		String line = null;
		while ((line = br.readLine()) != null) {
		    sb.append(line);
		}
//		System.out.println("请求响应结果："+sb);
		return sb.toString();
	}
}
