package io.lambda.unit2;

import java.util.Arrays;
import java.util.List;

import io.lambda.exercise.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Amit","Kushwaha",25),
				new Person("Rahul","Swagar",22),
				new Person("Ramo","Amold",44),
				new Person("Hena","Swagar",29),
				new Person("Laura","Willson",54));
		
		System.out.println("Using for loop");
		
		for(int i = 0; i<people.size(); i++){
			System.out.println(people.get(i));
		}
		
		System.out.println("Using for in loop");
		
		for(Person p : people){
			System.out.println(p);
		}
		
		System.out.println("Using forEach method");
		people.forEach(p->System.out.println(p));
		System.out.println("---------------------");
		people.forEach(System.out::println);

	}

}
