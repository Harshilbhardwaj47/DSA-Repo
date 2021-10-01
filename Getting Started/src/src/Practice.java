package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Practice {

	public static void main(String args[]) {
		// Write your code here
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		String letter = in.nextLine();
		int count = 0;

		char[] inp = word.toCharArray();
		char[] let = letter.toCharArray();

		for (int i = 0; i < word.length(); i++) {
			if (inp[i] == let[0]) {
				count++;
			}
		}

		System.out.print(count);

	}
}