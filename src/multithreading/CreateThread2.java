package multithreading;

public class CreateThread2 implements  Runnable{

    public void run(){
        System.out.println("thread is running....");
    }

    public static void main(String[] args) {

        CreateThread2 th2 = new CreateThread2();
        new Thread(th2).start();
        System.out.println(Thread.currentThread().getName());
    }
}
