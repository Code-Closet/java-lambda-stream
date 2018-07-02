package java8.lambda.tutorial;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		//Thread t = new Thread(() -> printMessege());
		Thread t = new Thread(MethodReferenceExample1::printMessege);
		t.start();

	}
	
	public static void printMessege() {
		System.out.println("Hello");
	}

}
