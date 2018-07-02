package java8.lambda.tutorial;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Alex", "Hayatti", 31),
				new Person("Zlatan", "Imbramowic", 31),
				new Person("Terry", "Tuner", 31),
				new Person("Tom", "McCannan", 31),
				new Person("Mohammed", "Salah", 31),
				new Person("Isko", "Hauge", 31),
				new Person("Thimotti", "Albani", 31));
		people.stream().forEach(System.out::println);
		people.stream()
		.filter(p -> p.getLastName().startsWith("A"))
		.forEach(p -> System.out.println(p.getLastName()));

	}

}
