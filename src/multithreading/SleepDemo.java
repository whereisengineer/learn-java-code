package multithreading;

class ThreadOne implements  Runnable{
    public void run(){
        System.out.println("Before sleeping....");
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException exc){
            System.out.println(exc);
        }

        System.out.println("Slept well...");
    }
}

public class SleepDemo {

    public static void main(String[] args) throws InterruptedException {

       ThreadOne to = new ThreadOne();
       new Thread(to).start();
    }
}
