package day4;

import java.util.Scanner;

/*
@author DELL a.k.a. Widia
Created with eclipse Version: 2022-09 (4.25.0)
Created on 10-11-2022 08:29:09
Last modified on 10-11-2022 08:29:09
Version 1.0
*/

public class Lesson4 {
	public static void main(String[] args) {
		String strNama = "";
		String strNama2 = "";
        Scanner sn = new Scanner(System.in);
        System.out.println("Masukkan Nama : ");
        strNama = sn.next();
        System.out.println("next : " + strNama);
        sn = new Scanner(System.in);
        System.out.println("Masukkan Nama Lengkap : ");
        strNama2 = sn.nextLine();        
        System.out.println("nextline : " + strNama2);
        sn.close();
	}
}
