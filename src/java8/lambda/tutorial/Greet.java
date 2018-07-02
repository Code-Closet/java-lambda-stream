package java8.lambda.tutorial;

public class Greet {

	public void greeter(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greet greet = new Greet();
		Greeting hello = new HelloWorldGreeting();
		greet.greeter(hello);
		
		Greeting lambaGreeting = () -> System.out.println("Hello World !");
		
		//lambaGreeting.perform();
		
		Greeting innerClass = new Greeting() {
			
			@Override
			public void perform() {
				System.out.println("Hello World !");
				
			}
		};
		//innerClass.perform();
		
		greet.greeter(lambaGreeting);
		greet.greeter(innerClass);
		greet.getStringLength(s -> s.length());
	}
	
	public static void getStringLength(StringLengthLambda l) {
		System.out.println(l.getLength("Lambda Length"));
	}

}

interface StringLengthLambda {
	int getLength(String s);
}