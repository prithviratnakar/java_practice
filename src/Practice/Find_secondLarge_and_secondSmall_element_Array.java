package Practice;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_secondLarge_and_secondSmall_element_Array {

	public static void main(String[] args) {

		int[] ar = { 7, 8, 5, 4, 9, 10, 20 };

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int num : ar) {
			list.add(num);
		}

		Collections.sort(list);
		System.out.println("Assending Order: " + list);

		int second_small = list.get(1);
		System.out.println("second small: " + second_small);

		int second_large = list.get(list.size() - 2);
		System.out.println("second small: " + second_large);

	}

}