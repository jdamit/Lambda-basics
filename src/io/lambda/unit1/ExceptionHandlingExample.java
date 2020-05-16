package io.lambda.unit1;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {

		int [] numArray = {1,2,3,4,5};
		int key = 2;
		
		process(numArray, key, wrapperLambda((v,k)->{
			System.out.println("Lambda called..!!!");
			System.out.println(v/k);
			}));
	}

	private static void process(int[] numArray, int key,
			BiConsumer<Integer, Integer> biConsumer) {
		for(int i:numArray){
			biConsumer.accept(i, key);
			
		}
	}
	
	public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer){
		return (v,k)->{
			try{
				biConsumer.accept(v, k);
				System.out.println("----------");
				biConsumer.accept(v, k);
			}catch(Exception e){
				System.out.println("Exception caught..!!");
			}
		};
	}

}
