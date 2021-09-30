package src;

public class Solution1 {

	void sort(int arr[]) {
		int key = 0;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	void show(int arr[]) {
		for (int i : arr) {
			System.err.println(i);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 31, 41, 59, 26, 41, 58 };
		Solution1 obj = new Solution1();
		obj.sort(arr);
		obj.show(arr);
	}
}
