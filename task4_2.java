package lesson1;

import java.util.Scanner;

public class task4_2 {

	public static int gradationI(int base, int degree) {
		int outcome=1;
		while(degree>0) {
			outcome*=base;
			degree--;
		}
		return outcome;
	}
	
	public static int gradationR(int base, int degree) {
		if (degree > 0) {
			return(base*gradationR(base,degree-1));
	   	} else {
	   		return 1;
	   	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a base and a power : ");
		Scanner reader = new Scanner(System.in);
		int base = reader.nextInt();
		int power = reader.nextInt();
		System.out.print("Result is " +  gradationI(base,power));
		System.out.println(" - itterative");
		System.out.print("Result is " +  gradationR(base,power));
		System.out.println(" - recursive ");
		
	}

}

