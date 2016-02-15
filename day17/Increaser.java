public class Increaser implements Runnable {
	private Counter c;
	public Increaser(Counter counter) {
		this.c = counter;
	}
	public  static void main(String args[]) {
	Counter counter = new Counter();
		for (int i = 0; i < 100; i++) {
			Increaser increaserTask = new Increaser(counter);
			Thread t = new Thread(increaserTask);
			t.start();
		}
	}
	public  void  run() {
			//synchronized(c){
				System.out.println("Starting at " + c.getCount());
				for (int i = 0; i < 1000; i++) {
					c.increase();
				}
				System.out.println("Stopping at " + c.getCount());
		//}
	}
}
// not synchronized
class Counter {
	protected int n = 0;
	public void increase() {
		n++;
	}
	
	public  int getCount() {
		return n;
	}
}

class SychronizedCounter extends Counter{
	public synchronized void increase() {
		n++;
	}
}
