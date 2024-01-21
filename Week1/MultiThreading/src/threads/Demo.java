package threads;

public class Demo extends Thread{
	public void run() {
        System.out.println("Thread is running");
    }
	public static void main(String[] args) {
		Demo myThread = new Demo();
        myThread.start();

	}

}
