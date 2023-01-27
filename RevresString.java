package com.stringprogrames;

public class RevresString {

	public static void main(String[] args) {
		String s1="Akash behera";
		String Rev="";
		for (int i = s1.length()-1;i >=0; i--) {
			Rev+=s1.charAt(i);
		}
		System.out.println(Rev);
	}

}
