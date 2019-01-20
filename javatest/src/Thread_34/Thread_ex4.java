package Thread_34;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 작업의 결과를 반환하는 쓰레드의 구현 ( Callable & Future 활용 )
 * @author User
 *
 */
public class Thread_ex4 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<Integer> task = () -> { 
											int sum = 0;
											for( int i = 0; i < 10; i++ ) 
												sum += i;
											return sum;
									   };
		ExecutorService pool = Executors.newSingleThreadExecutor();
		Future<Integer> fur = pool.submit(task);
		Integer result = fur.get(); // 쓰레드의 반환 값 획득
		System.out.println("resule : " + result );
		pool.shutdown();
		
	}
}
