package lessons11_12;

import java.util.HashSet;
import java.util.Set;

public class task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {-8, 1, 2, 3, 5, 7};
		int sum = 8;
		System.out.println(hasPair_HashSet(list, sum));
	}
	
	public static boolean hasPair_BruteForce(int[] list, int sum) {
		//0(n^2)
		
		
		for(int i = 0; i<list.length; i++) {
			for(int j = i +1; j<list.length; j++) {
				if(list[i] + list[j] == sum) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean hasPair_BinarySearch (int[] list, int sum) {
		//0(nlog(n))
		
		
		for(int i = 0; i<list.length; i++) {
			if( BinarySearch.binarySearch(list, sum - list[i]) > 0) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean hasPair_FromBothEnds(int[] list, int sum) { 
		//0(n)
		
		int lastIndex = list.length - 1;
		int firstIndex = 0;
		while (firstIndex < lastIndex) {
			int currentSum = list[firstIndex] + list[lastIndex];
			if(currentSum > sum) {
				lastIndex--;
			}else if(currentSum < sum) {
				firstIndex++;
			}else {
				return true;
			}
		}
		return false;
	}
	
	public static boolean hasPair_HashSet(int[] list, int sum) {
		//0(n)
		Set<Integer> rests = new HashSet<Integer>();
		for(int i = 0; i < list.length; i++) {
			if(rests.contains(list[i])) { //0(1)
				return true;
			}
			
			rests.add(sum - list[i]);
		}
		
		return false;
	}
	

}