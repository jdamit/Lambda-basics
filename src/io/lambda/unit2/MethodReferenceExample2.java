package io.lambda.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.lambda.exercise.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Amit","Kushwaha",25),
				new Person("Rahul","Swagar",24),
				new Person("Ramo","Amold",24),
				new Person("Hena","Swagar",24),
				new Person("Laura","Willson",24));
		
		for(char ch : "amit".toCharArray()){
			
		}
		
		//Step 1 sort list by last name
		Collections.sort(people, (p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
		
		//step2 create a method that print all elements in the list
		System.out.println("Print all");
		performConditionally(people, p->true, System.out::println);
		
	}

	private static void performConditionally (List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for(Person p : people){
			if(predicate.test(p)){
				consumer.accept(p);//System.out.println(p);
			}
		}
		
	}
}
