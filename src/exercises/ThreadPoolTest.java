package exercises;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

public class ThreadPoolTest {

	@Test
	public void testCreate() {
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
		
		fixedThreadPool.submit(new PrintRunnable());
		fixedThreadPool.submit(new PrintRunnable());
		fixedThreadPool.shutdown();
		fixedThreadPool.submit(new PrintRunnable());
	}
	
}
