package lesson1;

public class Task1_3 {
	public static void main(String[] args) {
	   	 
	   	 System.out.print(Recursive2pow(5));
	   	 System.out.println();
	   	 System.out.print(Iterative2pow(2, 5));
	}
	public static int Recursive2pow(int n) {
		if (n == 0) {
			return 1;
		}
		return 2 * Recursive2pow(n-1);
		
	}
	public static int Iterative2pow(int basis, int degree) {
		int outcome = 1;
		while(degree > 0) {
			outcome *= basis;
			degree--;
		}
		return outcome;
	}

}


