
public class MyThread implements Runnable {

	private final int counter;

	public MyThread(int counter) {
		this.counter = counter;
	}
	
	public int Throw()
	{
		return (1 + (int) (Math.random() * 6));
	}

	@Override
	public void run() {
		
		int num = 0;
		for (long i = 1; i < counter; i++) {
		      num = Throw();
		    }

		
		System.out.printf("%d\t", num);
	}

}
