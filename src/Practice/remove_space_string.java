package Practice;

import java.util.Scanner;

public class remove_space_string {

	public static void main(String[] args) {

		System.out.println("Enter your String: ");

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		System.out.println("Before: " + input);

		input = input.replaceAll("\\s", "");

		System.out.println("After:" + input);

	}

}
