package Thread_34;

public class Thread_ex {
	public static int a; 
	public static int b;
/*	public static String name = Thread.currentThread().getName(); 멤버변수는 메인메소드에서 실행한다. 실행하는 쓰레드가 Main 쓰레드 */
	public static void main(String[] args) throws InterruptedException {
		// 쓰레드가 생성하기위한 준비과정 1  ( 쓰레드가 해야할일 )
		Runnable job1 = () -> { 	   
								for( a= 0; a<20; a++) {
							        if( a%2==0 ) {
							        	System.out.println(Thread.currentThread().getName() + " " + a + "\t" );
							        	try {
											Thread.sleep(1000);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
							        }
								}
								System.out.println(Thread.currentThread().getName() + "의 종료");
							  };
		Runnable job2 = () -> { 	   
								for( b= 0; b<20; b++) {
									if( b%2==1 ) {
										System.out.println(Thread.currentThread().getName() +" " + b + "\t");
										try {
											Thread.sleep(1000);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
									}
								}
								System.out.println(Thread.currentThread().getName() + "의 종료");
							  };
							  
		// 쓰레드를 생성하기위한 준비과정 2 ( 쓰레드의 그릇을 준비 )
		Thread Thread1 = new Thread(job1);
		Thread Thread2 = new Thread(job2);
		// 쓰레드를 생성 ( 쓰레드를 생성하고 실행한다. )
		Thread1.start();
		Thread2.start();
		Thread1.join(); // Thread1이 참조하는 쓰레드의 종료를 기다림
		Thread2.join(); // Thread2가 참조하는 쓰레드의 종료를 기다림
		//현재 실행중인 쓰레드 출력
		System.out.println(Thread.currentThread().getName()); 
		System.out.println("main 쓰레드의 종료");

	}
}
