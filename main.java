
public class main {

	public static void main(String[] args) {

		System.out.println("Start");
		
		for (int i = 0; i < 25; i++) {
			Runnable T1 = new MyThread(i);
			Thread diceRoll = new Thread(T1);
			diceRoll.start();

		}
		System.out.println("Complete");
	}

}
