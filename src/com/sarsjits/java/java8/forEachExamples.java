package com.sarsjits.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * The class contains some examples related to the forEach api of Java 8. For
 * more on this http://www.baeldung.com/foreach-java
 * 
 * @author Jitendra Sarswat
 *
 */
public class forEachExamples {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names = Arrays.asList("Ram", "Shyam", "Ghanshyam");

		// New forEach accepts a consumer functional interface which can be used
		// Anonymous inner class
		names.forEach(new Consumer<String>() {

			@Override
			public void accept(String name) {
				System.out.println(name);
			}

		});

		// Now we can use Lambda expression to avoid writing the bulky expression of
		// anonymous inner classes

		Consumer<String> consumerNames = name -> System.out.println(name);

		// Now pass the same to forEach
		names.forEach(consumerNames);
	}

}
