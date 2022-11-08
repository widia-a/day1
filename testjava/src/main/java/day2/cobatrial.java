package day2;

import java.util.Random;

/*
@author DELL a.k.a. widia
Created with eclipse version
Created on 08-11-2022 10:22:19
Last modified on 08-11-2022 10:22:19
Version 1.0
*/

public class cobatrial {
	public static void main(String[] args) {
		String strA = "Tb@14XzM";
		char[] charA = strA.toCharArray();
//		System.out.println(charA[2]);
		
		int intB = 0;
		for(int i=0; i<strA.length(); i++) {
			intB += charA[i];
		}
//		System.out.println(intB);
		char charX = 69;
//		System.out.println(charX);
		
		Random ran = new Random();
		int intX = 0;
		char chY;
		String strB = "";
		
		for(int i=0; i<9; i++) {
			if(i<3) {
				chY = (char) ran.nextInt(65,91);
				strB = strB+chY;
			} else if(i<6) {
				chY = (char) ran.nextInt(97, 123);
				strB = strB+chY;
			} else if(i<9) {
				chY = (char) ran.nextInt(48, 58);
				strB = strB+chY;
			}
			
		}
		System.out.println(strB);
		}
		
	}

