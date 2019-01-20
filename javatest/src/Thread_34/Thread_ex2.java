package Thread_34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;



public class Thread_ex2 {
	public static void main(String[] args) throws InterruptedException {
		// 동기화 된 컬렉션 인스턴스. ( 쓰레드가 list를 통해서 컬렉션 인스턴스에 접근한다면 동기화가 보장된다. )
		List<Integer> list = Collections.synchronizedList(new ArrayList<>());
		
		ReentrantLock lock = new ReentrantLock();
		
		for (int i = 0 ; i < 15 ; i++) 
			list.add(i);
		System.out.println(list);
		
		Runnable task1 = () -> {	
									lock.lock();
									//동기화 블록
									//synchronized (list) {
									try {
										ListIterator<Integer> itr = list.listIterator();
									while( itr.hasNext() )
										itr.set(itr.next()+1);	
									}
									finally {
										lock.unlock();
									}
									//}
									
							   };		
		ExecutorService pool = Executors.newFixedThreadPool(3);	   
		
		pool.submit(task1);		
		pool.submit(task1);
		pool.submit(task1);
		
		pool.shutdown();
		pool.awaitTermination(100, TimeUnit.SECONDS);
		System.out.println(list);				  							   
		}
}
