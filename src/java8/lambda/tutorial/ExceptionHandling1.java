package java8.lambda.tutorial;

import java.util.function.BiConsumer;

public class ExceptionHandling1 {
	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		int key = 0;
		process(numbers, key, (v, k) -> {
			try {
				System.out.println(v/k);	
				
			}catch (Exception e) {
				System.out.println("Arithmetic exception");
			}
		});
	}

	private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i : numbers) {
			consumer.accept(i, key);			
		}
		
	}

}
