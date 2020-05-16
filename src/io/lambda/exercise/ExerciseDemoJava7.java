package io.lambda.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseDemoJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Amit","Kushwaha",25),
				new Person("Rahul","Swagar",24),
				new Person("Ramo","Amold",24),
				new Person("Hena","Swagar",24),
				new Person("Laura","Willson",24));
		
		//Step 1 sort list by last name
		Collections.sort(people, new Comparator<Person>(){
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		//step2 create a method that print all elements in the list
		System.out.println("Print all");
		printAll(people);
		
		//step3 create a method prints all people that have last name beginning with S
		System.out.println("Last Name start with 'S'");
		printLastNameConditionally(people, new Condition(){

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("S");
			}
			
		});

		System.out.println("First Name start with 'A'");
		printLastNameConditionally(people, new Condition(){

			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("A");
			}
			
		});
	}

	private static void printLastNameConditionally (List<Person> people, Condition condition) {
		for(Person p : people){
			if(condition.test(p)){
				System.out.println(p);
			}
		}
		
	}

	private static void printAll(List<Person> people) {

		for(Person p:people){
			System.out.println(p);
		}
	}

}

@FunctionalInterface
interface Condition{
	boolean test(Person p);
}
