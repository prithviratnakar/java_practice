package Practice;

import java.util.ArrayList;
import java.util.List;

public class Findind_common_elements_Array {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 5, 6, 7, 8, 9 };
		List<Integer> common = new ArrayList<>();

		for (int i = 0; i < array1.length; i++) {

			for (int j = 0; j < array2.length; j++) {

				if (array1[i] == array2[j]) {

					common.add(array1[i]);

				}

			}

		}

		System.out.println(common);

	}

}