package Thread_34;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/***
 * 다른 메모리 영역에 접근하는 쓰레드 사이의 동기화 예제
 * 
 * @param d
 * @author User
 *
 */
class Counter {
	private static Counter instance;
	private int count1;
	private int count2;
//	private ReentrantLock lock = new ReentrantLock();
//	private ReentrantLock lock2 = new ReentrantLock();
//	19초, 48초, 1분20초, 1분 50초 = 접근하는 메모리와 상관없이 모든 메소드에 똑같은 lock건 결과
//	30초, 1분 47초 2개, 2분 18초 = 접근하는 메모리영역이 같은 메소드 2개 끼리 구분하여 lock, lock2를 건 결과
//	45초 2개, 48초 2개 = 모든 메소드에 동기화블록(this)로 동기화 시킨경우
	private Counter() {
		count1 = 0;
		count2 = 0;
	}
	public static Counter getInstance() {
		// 메소드 호출시 인스턴스가 생성되어 있지 않다면 새로생성.
		if( instance == null )
			instance = new Counter();
		else 
			System.out.println("이미 인스턴스가 생성");
			
		return instance;
	}
	
	public void increment1() {
		synchronized (this) {		
			++count1;
		}
	}
	public void decrement1() {
		synchronized (this) {	
			--count1;
		}
	}
	public void increment2() {
		synchronized (this) {	
		++count2;
		}
	}
	public void decrement2() {
		synchronized (this) {	
		--count2;
		}
	}
	public void getcount1() {
		System.out.print(Thread.currentThread().getName() + " count1 : " + count1 + "\t");
	}
	public void getcount2() {

		System.out.print("count2 : " + count2 + "\t");
	}
}
public class Thread_ex3 {
	
	public static void main(String[] args) throws InterruptedException {
		Counter c = Counter.getInstance();
		System.out.println(c);
		
		Runnable task1 = () -> { 
										Instant start = Instant.now();
									for( int i = 0; i < 400000000 ; i++ ) {
										c.increment1(); 
										c.decrement1();
									}
										Instant end = Instant.now();
										Duration time = Duration.between(start, end);
										System.out.println(time);
										
									//	c.decrement2();		
									//	c.getcount1();
									//	c.getcount2();
									//}
							   };
							   
		Runnable task2 = () -> {	
									Instant start = Instant.now();
									for( int i = 0; i < 400000000 ; i++ ) {
										c.decrement2(); 
										c.increment2();
									}								
									Instant end = Instant.now();
									Duration time = Duration.between(start, end);
									System.out.println(time);
							   };
							   
		ExecutorService pool = Executors.newFixedThreadPool(4);
		
		pool.submit(task1);
		pool.submit(task2);
		pool.submit(task1);
		pool.submit(task2);

		
		pool.shutdown();
		pool.awaitTermination(1000, TimeUnit.SECONDS);
		c.getcount1();
		
	}
}
