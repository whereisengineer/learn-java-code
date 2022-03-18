package multithreading;

public class CreateThread extends Thread {

    public void run(){

        System.out.println(Thread.currentThread().getName()+ " Thread is running....");
    }

    public static void main(String[] args) {

        CreateThread th = new CreateThread();
        System.out.println(Thread.currentThread().getName());
        th.start();
        System.out.println(Thread.currentThread().getName());


    }
}
