package java8.lambda.tutorial;

public class RunnableExample {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Started Thread in inner class");				
			}
		});
		thread.run();
		Thread lambdaThread = new Thread(() -> System.out.println("Started Thread in lambda class"));
		lambdaThread.run();
	}

}
