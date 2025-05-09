package multithreading;

public class MainClass extends Thread{

	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("MinClass : " + i);
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("----Thread Practical----");
		
		// By Using Thread Class
		
//		ThreadDemo obj = new ThreadDemo();
//		MainClass obj2 = new MainClass();
//		obj.start();
//		obj2.start();
		
		
		// By using Runnable Interface
		RunnebaleThread obj3 = new RunnebaleThread();
		Thread tobj1 = new Thread(obj3);
		tobj1.start();
		
		RunnableThread2 obj4 = new RunnableThread2();
		Thread tobj2 = new Thread(obj4);
		tobj2.start();
		
	}

}
