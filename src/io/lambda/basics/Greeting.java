package io.lambda.basics;

@FunctionalInterface
public interface Greeting {

	void perform();
	
	default void foo(){
		System.out.println("Default method...!!");
	};
	
	boolean equals(Object i);
}
