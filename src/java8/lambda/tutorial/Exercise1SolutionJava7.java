package java8.lambda.tutorial;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise1SolutionJava7 {

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
		
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}			
		});
		
		//Step 2: Create a method for printing all person
		
		printAll(people);
		
		//Step 3: Create a method that prints all name that have first name starts with 'T'
		printConditionally(people, new Condition() {			
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("T")? true : false;
			}
		});
		printConditionally(people, new Condition() {			
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("H")? true : false;
			}
		});
	}

	private static void printConditionally(List<Person> people, Condition c) {
		for(Person p : people) {
			if(c.test(p))
				System.out.println(p.toString());
		}		
	}

	private static void printAll(List<Person> people) {
		for(Person p : people) {
			System.out.println(p.toString());
		}
	}

}

interface Condition {
	boolean test(Person p);
}
