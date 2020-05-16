package io.lambda.basics;

public class TypeInferenceExample {

	public static void main(String[] args) {
		//StringLengthLambda myLambda = (String s)-> s.length();
		//StringLengthLambda myLambda = (s)-> s.length(); // you can remove the type of argument b'coz it is already defined in functional interface.
		StringLengthLambda myLambda = s-> s.length(); // you can remove parenthesis if there is only a single argument.
		System.out.println(myLambda.getLength("hello lambda"));
		printLambda(s-> s.length());
		
		Thread myThread = new Thread(()->System.out.print("thread created..!!"));
		myThread.run();

	}
	
	public static void printLambda(StringLengthLambda l){
		System.out.println(l.getLength("hello lambda..!!"));
	}
	
	interface StringLengthLambda{
		int getLength(String s);
	}

}
