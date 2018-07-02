package java8.lambda.tutorial;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Exercise1SolutionJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Alex", "Hayatti", 31),
				new Person("Zlatan", "Imbramowic", 31),
				new Person("Terry", "Tuner", 31),
				new Person("Tom", "McCannan", 31),
				new Person("Mohammed", "Salah", 31),
				new Person("Isko", "Hauge", 31),
				new Person("Thimotti", "Albani", 31));
		
		//Step 1: Sort list by last name
		
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		//Step 2: Create a method for printing all person
		
		//printAll(people);
		printConditionally(people, p -> true);
		
		//Step 3: Create a method that prints all name that have first name starts with 'T'
		printConditionally(people, p -> p.getFirstName().startsWith("T"));
		printConditionally(people, p -> p.getLastName().startsWith("H"));
		
		performConditionally(people, p -> true, p -> System.out.println(p.getLastName()));
	}

	private static void printConditionally(List<Person> people,Predicate<Person> predicate) {
		for(Person p : people) {
			if(predicate.test(p))
				System.out.println(p.toString());
		}		
	}
	
	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p : people) {
			if(predicate.test(p))
				consumer.accept(p);
		}	
	}

	private static void printAll(List<Person> people) {
		for(Person p : people) {
			System.out.println(p.toString());
		}
	}

}
