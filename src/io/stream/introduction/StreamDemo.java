package io.stream.introduction;

import java.util.Arrays;
import java.util.List;

import io.lambda.exercise.Person;

public class StreamDemo {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Amit","Kushwaha",25),
				new Person("Rahul","Swagar",22),
				new Person("Ramo","Amold",44),
				new Person("Hena","Swagar",29),
				new Person("Laura","Willson",54));
		
		people.stream()
		.filter(p->p.getFirstName().startsWith("R"))
		.forEach(System.out::println);
		
		Long count = people.stream()
				.filter(p->p.getFirstName().startsWith("R"))
				.count();
		System.out.println(count);
	}
}
