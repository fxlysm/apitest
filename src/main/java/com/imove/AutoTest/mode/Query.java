package com.imove.AutoTest.mode;

import java.util.Map;
import com.imove.AutoTest.util.PostTools;
import com.imove.AutoTest.util.SignUtils;



public class Query {

	public static String ClosePost(String url,Map<String, String> map){
		
				Map<String, String> params = SignUtils.paraFilter2(map);
//				if (params.containsKey("sign"))
//					params.remove("sign");
				StringBuilder buf = new StringBuilder((params.size() + 1) * 10);

				SignUtils.buildPayParams(buf, params, false);
				String preStr = buf.toString();
				System.out.println("preStr: "+preStr);
	
		    	String ss=PostTools.sendPost(url, preStr);

		    	return ss;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
