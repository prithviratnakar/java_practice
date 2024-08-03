package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Findind_common_elements_Array2 {

	public static void main(String[] args) {

	     int[] array1 = {1, 2, 3, 4, 5};
	        int[] array2 = {3, 4, 5, 6, 7};

	        Set<Integer> set1 = new HashSet<>();
	        Set<Integer> commonElements = new HashSet<>();

	        // Add elements from array1 to set1
	        for (int num : array1) {
	            set1.add(num);
	        }

	        // Check common elements from array2 with set1
	        for (int num : array2) {
	            if (set1.contains(num)) {
	                commonElements.add(num);
	            }
	        }

	        System.out.println("Common elements: " + commonElements);
	    }

}