import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.*;

public class MyExecutor {
	protected final Queue<Runnable> queue = new ArrayDeque();
	ExecutorService  executor = Executors.newFixedThreadPool(10000);
	private Runnable currentRunnable;
	
	public Runnable execute(r){		
			queue.offer(r);
			
	}

	public void runNext(){
		while(queue.isEmpy()){
			
		
		}
		
	}
	
}

