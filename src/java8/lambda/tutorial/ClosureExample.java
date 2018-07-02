package java8.lambda.tutorial;

public class ClosureExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;

		doProcess(a, new Process() {
			
			@Override
			public void process(int i) {
				System.out.println(i+b);
				
			}
		});
		doProcess(a, i -> System.out.println(i+b));
	}

	private static void doProcess(int i, Process process) {
		process.process(i);
	}
}

interface Process {
	void process(int i);
}