package src;

import java.util.*;

public class Practice2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Integer sys = in.nextInt();
		Integer dis = in.nextInt();

		String sy = sys.toString();
		String di = dis.toString();

		char s[] = sy.toCharArray();
		char d[] = di.toCharArray();
		int count = 0;

		for (int i = 0; i < s.length - 1; i++) {
			if (s[i] == '0') {
				count = d[i + 1] - d[i] + d[i] - d[i - 1];

			}
		}
		System.out.println(count);

	}
}
