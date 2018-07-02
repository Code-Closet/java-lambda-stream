package java8.lambda.tutorial;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Alex", "Hayatti", 31),
				new Person("Zlatan", "Imbramowic", 31),
				new Person("Terry", "Tuner", 31),
				new Person("Tom", "McCannan", 31),
				new Person("Mohammed", "Salah", 31),
				new Person("Isko", "Hauge", 31),
				new Person("Thimotti", "Albani", 31));
		
		
		
		performConditionally(people, p -> true, System.out::println);
	}
	
	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p : people) {
			if(predicate.test(p))
				consumer.accept(p);
		}	
	}


}
