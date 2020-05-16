package io.lambda.basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Greeter {

	public void greet(Greeting greeting){
		greeting.perform();
	}
	public static void main(String[] args) {
		
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDate.now().minus(10, ChronoUnit.YEARS));
		ArithematicOpc sumLambda = input -> input+input;
		System.out.println("sumLambda: "+sumLambda.operation(5));
		ArithematicOpc subLambda = input -> input-input;
		System.out.println("subLambda: "+subLambda.operation(5));
		ArithematicOpc multiLambda = input -> input*input;
		System.out.println("multiLambda: "+multiLambda.operation(5));
		ArithematicOpc divLambda = input -> input/input;
		System.out.println("divLambda: "+divLambda.operation(5));
		
		Greeter greeter = new Greeter();
		Greeting greeting = new HelloWorldGreeting();// create an instance of a class that implements Greeting interface.
		greeter.greet(greeting);
		
		Greeting myLambdaGreeting = ()->System.out.println("Lambda hello world!");//creating a lambda expression that implements a function
		myLambdaGreeting.perform();
		
		Greeting innerClassGreeting = new Greeting(){
			public void perform(){
				System.out.println("inner class hello world!");
			}
		};
		innerClassGreeting.perform();
	}
	
}
