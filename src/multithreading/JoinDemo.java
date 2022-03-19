package multithreading;

class MyThread implements Runnable{

    public void run(){
        for(int i =0 ; i<10; i++){
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException ex){

            }

            System.out.println(i);
        }
    }
}

public class JoinDemo {

    public static void main(String[] args) throws InterruptedException {

        MyThread th = new MyThread();
        Thread thread = new Thread(th);
        thread.start();
        thread.join();
        for(int i =0 ; i<10; i++){
            System.out.println("main thread " + i);
        }


    }
}
