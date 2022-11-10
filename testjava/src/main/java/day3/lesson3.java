package day3;

import java.util.Scanner;

/*
@author DELL a.k.a. Widia
Created with eclipse Version: 2022-09 (4.25.0)
Created on 09-11-2022 09:49:11
Last modified on 09-11-2022 09:49:11
Version 1.0
*/

public class lesson3 {
    public static void main(String[] args) {
    	// String strK = "OP";
        String strK = new String("OP");
        // if(strK == "OP"){
        if(strK.equals("OP")){
        // System.out.println("True");
        }
        else{
        // System.out.println("False");
        }
        
        // Random ram = new Random();
        String strH = new String();
        String strF = "";
        
        // System.out.println(ram);
        System.out.println(strH);
        System.out.println(strF);
        
        String strFirst = "Doyok";
        String strSecond = "doyok";
        System.out.println(strFirst.equals(strSecond));
        System.out.println(strFirst.equalsIgnoreCase(strSecond));
        
        String strNama = "Widia Anggraeni" + " " + "ITDP7";
        Scanner sn = new Scanner(strNama);
//        System.out.println("next : " + sn.next());
        System.out.println("nextline : " + sn.nextLine());
        sn.close();
        
        char[] chD = {'3','4','5'};
        char[] chY = new char[3];
        chY[2] = 'F';

        System.out.println(chY);
        
        double[] doP = new double[5];
        doP[4] = 8.9;
        System.out.println(doP[0]);
        
        
//        array 2D
        String [][] strS = new String[2][3];
		strS[0][0] = "AB";
		strS[0][1] = "CD";
		strS[0][2] = "EF";
		strS[1][0] = "GH";
		strS[1][1] = "IJ";
		strS[1][2] = "KL";
		StringBuilder sBuild = new StringBuilder();
		String strPrintz = "";
		
		for(int i=0;i<strS.length;i++)
		{
			
			for(int j=0;j<strS[i].length;j++)
			{
				if(j==strS[i].length-1)
				{
					sBuild.setLength(0);
					strPrintz = sBuild.append(strPrintz).append(strS[i][j]).append("\n").toString();
				}else
				{
					sBuild.setLength(0);
					strPrintz = sBuild.append(strPrintz).append(strS[i][j]).append(",").toString();
				}				
			}
			
		}
		System.out.print(strPrintz);      

    }

}
