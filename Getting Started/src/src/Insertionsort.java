package src;

import java.util.*;

public class Insertionsort {

	void Sort(int array[]) {
		int key = 0;
		for (int i = 1; i < array.length; i++) {
			key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}

	void show(int array[]) {
		for (int i : array) {
			System.err.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int array_size = in.nextInt();
		int array[] = new int[array_size];

		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}

		Insertionsort obj = new Insertionsort();

		obj.Sort(array);
		obj.show(array);

	}
}
