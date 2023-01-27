package com.stringprogrames;

public class RevString {

	public static void main(String[] args) {
		String s1="mooR";
		int n=s1.length()-1;
		String Rev="";
		for(int i=n;i>=0;i--) {
			Rev=Rev+s1.charAt(i);
		}
		System.out.println(Rev);
	}

}
