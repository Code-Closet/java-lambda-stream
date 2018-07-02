package java8.lambda.tutorial;

public class ThisReferenceExample {

	private  void doProcess(int i, Process p) {
		p.process(i);
	}
	
	private void execute() {
		doProcess(10, i -> {
			System.out.println("Value inside execute: "+i);
			System.out.println(" inside execute this: " +this);
		});
	}
	
	public static void main(String[] args) {
		ThisReferenceExample thisRef = new ThisReferenceExample();
		thisRef.doProcess(10, new Process() {

			@Override
			public void process(int i) {
				System.out.println("Value : "+i);
				System.out.println(this);
				
			}
			public String toString() {
				return "This is an anonymous inner class";
			}
		});
		
		thisRef.doProcess(10, i -> {
			System.out.println("Value : "+i);
			//System.out.println(this);
		});
		thisRef.execute();

	}
	
	public String toString() {
		return "This is the main reference";
	}

}
