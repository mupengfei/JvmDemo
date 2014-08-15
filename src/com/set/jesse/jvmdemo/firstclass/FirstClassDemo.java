package com.set.jesse.jvmdemo.firstclass;

public class FirstClassDemo {
	public static String float2Binary(float var){
		return Integer.toBinaryString(Float.floatToIntBits(100.2f));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(float2Binary(100.2f));
	}

}
