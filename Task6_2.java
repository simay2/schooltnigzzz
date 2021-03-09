package eddu.smg;

import java.util.ArrayList;
import java.util.Scanner;

public class Task6_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
    		int n = in.nextInt();
            list.add(n);
        }
        System.out.println("The array list: " + list);
        shuffle(list);
        System.out.println("Shuffled: " + list);
        sort(list);
        System.out.println("Sorted: " + list);
        
        System.out.println( "The minimal of the list: "+ min(list));
        

    }

    public static <E> void shuffle(ArrayList<E> list) {

        for (int i = 0; i < list.size(); i++) {
            int random = (int) (Math.random() * list.size());
            E tmp = list.get(random);
            list.set(random, list.get(i));
            list.set(i, tmp);
        }
    }
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {


        for (int i = 0; i < list.size() - 1; i++) {
            E currentMin = list.get(i);
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).compareTo(currentMin) < 0) {
                    currentMin = list.get(j);
                    min = j;
                }
            }

            if (min != i) {
                list.set(min, list.get(i));
                list.set(i, currentMin);
            }
        }
    }
    public static <E extends Comparable<E>> E min(ArrayList<E> list) {
        E min = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(min) < 0) {
                min = list.get(i);
            }
        }

        return min;
    }

}
