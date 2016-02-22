import java.util.concurrent.*;

public class TextLoopExecutor implements Runnable {

	public static final int COUNT = 10;
	private final String name;

	public TextLoopExecutor(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < COUNT; i++) {
			System.out.println("Loop:" + name + ", iteration:" + i + ".");
		}
	}
	public static void main(String args[]) {
		
		BlockingQueue queue = new LinkedBlockingDeque();
		
		ExecutorService  executor = new ThreadPoolExecutor(1000000, 1000000, 1L,TimeUnit.SECONDS, queue);
		//ExecutorService  executor = Executors.newFixedThreadPool(10000);
		try{
			executor.awaitTermination(2,  TimeUnit.SECONDS);
		} catch (InterruptedException e) {
				
		}
		if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))) {
			System.out.println("USAGE: java TextLoopExecutor <mode>");
			System.out.println(" mode 0: without threads");
			System.out.println(" mode 1: with threads");
		} else if (args[0].equals("0")) {
			for (int i = 0; i < 10; i++) {
				Runnable r = new TextLoopExecutor("Thread " + i);
				executor.execute(r);
			}
		} else {
			// should use single thread executor...
			for (int i = 0; i < 10; i++) {
				Runnable r = new TextLoopExecutor("Thread " + i);
				executor.execute(r);
				}
		}
		//System.exit(1);
		executor.shutdown();
		
	}
	
}