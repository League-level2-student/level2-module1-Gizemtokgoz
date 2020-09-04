package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> list = new ArrayList<String>();
		String thing1 = "zero";
		String thing2 = "one";
		String thing3 = "two";
		String thing4 = "three";
		String thing5 = "four";

		list.add(thing1);
		list.add(thing2);
		list.add(thing3);
		list.add(thing4);
		list.add(thing5);
		// 2. Add five Strings to your list
		// list(1) = "";
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 4. Print all the Strings using a for-each loop
		for (String string : list) {
			System.out.println(string);
		}
		// 5. Print only the even numbered elements in the list.
		System.out.println("........");
		for (int i = 0; i < list.size(); i++) {
			if (i % 2 == 0) {
				System.out.println(list.get(i));
			}
		}
		System.out.println("........");
		// 6. Print all the Strings in reverse order.
		for (int i = 4; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		System.out.println("........");
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("e")) {
				System.out.println(list.get(i));
			}
		}
	}
}
