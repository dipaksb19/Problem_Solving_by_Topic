package multithreading;

public class ThreadDemo extends Thread{

	@Override
	public void run(){
		for(int i = 1; i <= 10; i++) {
			System.out.println("Thread Class : " + i);
		}
	}
}
