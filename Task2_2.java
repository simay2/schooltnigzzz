package eddu.smg;

import java.util.Scanner;

public class Task2_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("X = ");
		int x = in.nextInt();
		System.out.println(dec2Bin(x));
	}
	
	public static String dec2Bin (int value) {
		if (value == 1) {
			return "1";
		}
	
			return dec2Bin(value / 2 ) + value % 2; 
		}
	}
