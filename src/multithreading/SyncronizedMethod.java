package multithreading;

class FetchBal{
    private static float bal=1000;

    public synchronized float getBalance(){
        return bal;
    }

    public void setBal(float balance){
        bal = balance;
    }
}


class Withdraw implements Runnable{
    float money;
    FetchBal th;
    Withdraw(FetchBal th, float money){
        this.th = th;
        this.money = money;
    }

    public void run(){

        float balance = th.getBalance();
        th.setBal(balance-money);
         balance = th.getBalance();
        System.out.println("money left after withdrawing is "+ (balance));
    }
}

public class SyncronizedMethod {

    public static void main(String[] args) {

        FetchBal fb = new FetchBal();
        Withdraw wTh1 = new Withdraw(fb,200);
        new Thread(wTh1).start();
        Withdraw wTh2 = new Withdraw(fb,300);
        new Thread(wTh2).start();

    }
}
