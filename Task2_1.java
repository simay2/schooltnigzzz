package eddu.smg;

import java.util.Scanner;

public class Task2_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("X = ?");
		int x = in.nextInt();
		if(odd(x)) {
			System.out.println(x + " is odd");
		}
		else if(even(x)) {
			System.out.println(x + " is even");
		}
	}
	
	public static boolean odd(int x) {
		if(x==1) {
			return true;
		}
		else if(x==0) {
			return false;
		}
		else {
			return odd(x-2);
		}
	}
	public static boolean even(int x) {
		if(x==1) {
			return false;
		}
		else if(x==0) {
			return true;
		}
		else {
			return even(x-2);
		}
	}
}
