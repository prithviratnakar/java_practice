package Practice;

public class Reverse_String {

	public static void main(String[] args) {

		// By using chatAt method
		String s1 = "Ratnakar";

		String s2 = "";

		for (int i = s1.length() - 1; i >= 0; i--) {

			s2 = s2 + s1.charAt(i);
		}

		System.out.println("Reverse String= " + s2);
		System.out.println(s1.length());

		if (s1.equalsIgnoreCase(s2)) {

			System.out.println("String is Palidrome");
		} else {

			System.out.println("String is not Palidrome");

		}
	//-------------------------------------------------------------------------------------------//

		// By using StringBuilder

		String input = "Welcome to JAVA";

		StringBuilder input1 = new StringBuilder(input);

		// input1.append(input);

		System.out.println("String= " + input);
		input1.reverse();

		System.out.println("Reverse String= " + input1);
		
	//-------------------------------------------------------------------------------------------//

		// By using StringBuffer

		String a1 = "Prithvi";

		StringBuffer a2 = new StringBuffer();

		a2.append(a1);

		a2.reverse();

		System.out.println("Reverse String= " + a2);
	}

}
