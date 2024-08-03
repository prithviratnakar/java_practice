package Practice;

import java.util.Arrays;

public class Find_min_max_Array {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 9, 10, 55, 14 };

		Arrays.sort(arr);

		System.out.println("min is : " + arr[0]);
		System.out.println("max is : " + arr[arr.length - 1]);
	}

}
