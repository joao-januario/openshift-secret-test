
public class main {

	public static void main(String[] args) throws InterruptedException {
		printVars();
		while (true) {
			Thread.sleep(5000);
			printVars();

		}

	}
	
	private static void printVars() {
		System.out.println(System.getenv("myconfigkey"));
		System.out.println(System.getenv("mysecretkey"));
	}

}
