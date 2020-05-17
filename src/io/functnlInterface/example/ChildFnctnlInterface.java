package io.functnlInterface.example;

@FunctionalInterface
public interface ChildFnctnlInterface extends FnctnalInterface{

	@Override
	public void abstractMethod();
	
	@Override
	public String toString();
	
	public default void defaultMethod(){
		System.out.println("Default method inside the functional interface.");
	}
	
	public static void staticMethod(){
		System.out.println("Static method inside the functional interface.");
	}
}
