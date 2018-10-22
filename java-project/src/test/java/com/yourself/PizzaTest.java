package com.yourself;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

public class PizzaTest {

	@Test
	public void test() throws FileNotFoundException {
		
		File file = new File("./src/main/java/com/yourself/Pizza.java");
		
		if (!existsInFile("new Customer", file)) {
			success(false);
			msg("Oops! 🐞", "It looks like you left something out!");
			msg("Oops! 🐞", "Check your code and try again!");
			msg("Hint 💡", "Don't forget to create a new Customer object to store the customer data.");
			return;
		}
		if (!existsInFile("StoreLocator.findClosestStoreToCustomer", file)) {
			success(false);
			msg("Oops! 🐞", "It looks like you left something out!");
			msg("Oops! 🐞", "Check your code and try again!");
			msg("Hint 💡", "Don't forget to use the StoreLocator class to find the closest store to a customer.");
			return;
		}
		if (!existsInFile("addItem", file)) {
			success(false);
			msg("Oops! 🐞", "It looks like you left something out!");
            msg("Oops! 🐞", "Check your code and try again!");
            msg("Hint 💡", "Don't forget to use the Order class to add items to your order.");
			return;
		}
		if (!existsInFile("new CreditCard", file)) {
			success(false);
			msg("Oops! 🐞", "It looks like you left something out!");
            msg("Oops! 🐞", "Check your code and try again!");
            msg("Hint 💡", "Don't forget to create a new CreditCard object for payment.");
			return;
		}
		if (!existsInFile("placeOrder", file)) {
			success(false);
			msg("Oops! 🐞", "It looks like you left something out!");
            msg("Oops! 🐞", "Check your code and try again!");
            msg("Hint 💡", "Don't forget to place the order using the method on the Store class.");
			return;
		}
		
		try {
			Pizza.orderPizza();
		} catch (PizzaException pe) {
			success(false);
			msg("Oops! 🐞", "Something isn't right here...");
			msg("Oops! 🐞", "Your code ran properly, but it didn't give the right result.");
			msg("Oops! 🐞", "It would be a shame if you ordered the wrong type of pizza or delivered it to the wrong place!");
			msg("Hint 💡", pe.getMessage());
			return;
		}
		
		success(true);
		msg("My personal Yoda, you are. 🙏", "Congrats, you did it! ");
		msg("My personal Yoda, you are. 🙏", "");
		msg("My personal Yoda, you are. 🙏", "__.-._");
		msg("My personal Yoda, you are. 🙏", "'-._\\7'");
		msg("My personal Yoda, you are. 🙏", " /'.-c");
		msg("My personal Yoda, you are. 🙏", " |  /T");
		msg("My personal Yoda, you are. 🙏", "_)_/LI");
		msg("Kudos 🌟", "Hooray, it worked!");
		msg("Kudos 🌟", "Treat yourself to some pizza as a reward!");
		msg("Kudos 🌟", "");
		msg("Kudos 🌟", "This is just a simulation, but similar code could be used to order real pizza!");
		
	}

	private static void msg(String channel, String msg) {
		System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg));
	}

	private static void success(boolean success) {
		System.out.println(String.format("TECHIO> success %s", success));
	}

	// check if a string exists in a text file
	private static boolean existsInFile(String str, File file) throws FileNotFoundException {
		Scanner scanner = new Scanner(file);
		try {
			while (scanner.hasNextLine()) {
				if (scanner.nextLine().contains(str))
					return true;
			}
			return false;
		} finally {
			scanner.close();
		}
	}
}