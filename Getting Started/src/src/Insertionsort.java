package src;

import java.util.*;

public class Insertionsort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int array_size = in.nextInt();
		int array[] = new int[array_size];

		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}

	}

	public static void Sort(int array[]) {
		
		for (int i = 2; i < array.length; i++) {

		}
	}

	public static void show(int array[]) {
		for (int i : array) {
			System.err.println(i);
		}
	}
}
