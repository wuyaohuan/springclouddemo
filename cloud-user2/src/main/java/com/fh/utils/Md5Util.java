package com.fh.utils;

import java.security.MessageDigest;

/**
 * 
* @ClassName: Md5Util 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author Zhangtw
* @e-mail 1058202069@qq.com
* @date 2019年2月16日 上午9:37:25 
* @version V1.0
 */
public class Md5Util {
	public final static String md5(String s){
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		try {
			byte[] strTemp = s.getBytes();
			// 使用MD5创建MessageDigest对象
			MessageDigest mdTemp = MessageDigest.getInstance("MD5");
			mdTemp.update(strTemp);
			byte[] md = mdTemp.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte b = md[i];
				// 将每个数(int)b进行双字节加密
				str[k++] = hexDigits[b >> 4 & 0xf];
				str[k++] = hexDigits[b & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			return null;
		}
	}
	
	
}
