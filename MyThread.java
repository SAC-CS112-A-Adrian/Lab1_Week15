
public class MyThread implements Runnable {

	private final int diceRolled;

	public MyThread(int diceRolled) {
		this.diceRolled = diceRolled;
	}

	@Override
	public void run() {
		int num = (1 + (int) (Math.random() * 6));
		System.out.printf("%d\t", num);
	}

}
