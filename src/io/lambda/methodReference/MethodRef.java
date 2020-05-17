package io.lambda.methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodRef {
	
	public static void main(String[] args) {
		
		List<Order> orderBook = new ArrayList<>();
		
		orderBook.add(new Order(1000, "GOOG.NS", 1220.17, Order.Side.BUY));
		orderBook.add(new Order(4000, "MSFT.NS", 37.47, Order.Side.SELL));
		orderBook.add(new Order(2000, "JAVA.NS", 850.35, Order.Side.BUY));
		
		System.out.println("Before sorting:");
		orderBook.forEach(o -> System.out.println(o));
		System.out.println();
		
		// Sort all orders, using lambda expression 
		Collections.sort(orderBook, (o1, o2) -> o1.getQuantity() - o2.getQuantity());
		
		/*
		 * replacing lambda expression to method reference Above code can also
		 * be written like this, where we are just calling a method of Order
		 * class from lambda expression, this can be replaced by Method
		 * reference.
		 */
		Collections.sort(orderBook, (o1, o2) -> Order.compareByQuantity(o1, o2));
		Collections.sort(orderBook, Order :: compareByQuantity);
		System.out.println("After sorting by order quantity:");
		orderBook.forEach(System.out :: println);
		System.out.println();
		/*
		 * Did you notice, two things while using method reference first, we use
		 * :: double colon to invoke method, similar to scope resolution
		 * operator of C++. Second, you don't need to provide parenthesis for
		 * method parameter, it’s just a name. Similarly you can call other
		 * static method using method reference. Another key thing is syntax of
		 * method must match with syntax of functional interface, for example
		 * compareByQuantity() syntax is same as compare() method of Comparator
		 * interface, which is a functional interface and Collections.sort()
		 * accept Comparator. Let's sort this List by trade value
		 */
		Collections.sort(orderBook, Order::compareByValue);
		System.out.println("After sorting by trade value:");
		orderBook.forEach(System.out :: println);
		System.out.println();
		/*
		 * Java supports four types of method reference, let's see example of
		 * each of them Our previous example, in which we are referring to
		 * static method was an example of static method reference, while below
		 * is an example of instance method reference, where we are invoking and
		 * instance method from Order class. You can reference a constructor in
		 * the same way as a static method by using the name new
		 */

		Order order = orderBook.get(0); // you need a reference of object
		Collections.sort(orderBook, order :: compareByPrice);
		System.out.println("After sorting by price:");
		orderBook.forEach(System.out :: println);
		System.out.println();
		/*
		 * method reference example of an Arbitrary Object of a Particular Type
		 * equivalent lambda expression for following would be (String a, String
		 * b)-> a.compareToIgnoreCase(b)
		 */
		String[] symbols = { "GOOG.NS", "APPL.NS", "MSFT.NS", "AMZN.NS" };
		Arrays.sort(symbols, String::compareToIgnoreCase);
		List<String> symbolsList = Arrays.asList(symbols);
		System.out.println("After sorting by name:");
		symbolsList.forEach(System.out :: println);
	}

}
