package lesson1;

public class Task1_1 {
	public static void main(String[] args) {
	  	 System.out.println("Sum is " + xMethod(9));
	  	 System.out.println("Sum is " +yMethod(5));
	}

	public static int xMethod(int n) {
	  	 if (n == 1)
	  		 return 1;
	  	 else
	  		 return n + xMethod(n - 1);
	}

	public static int yMethod(int n) {
		int sum = 0;
		for (int i =1; i<=n; i++) {
			sum +=i;
		}
		return sum;
		}
	}

