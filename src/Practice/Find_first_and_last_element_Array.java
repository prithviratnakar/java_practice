package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_first_and_last_element_Array {

	public static void main(String[] args) {

		int[] ar = { 7, 8, 5, 4, 9 };

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int num : ar) {
			list.add(num);
		}

		int first = list.get(0);

		System.out.println(first);

		int last = list.get(list.size() - 1);

		System.out.println(last);

	}

}