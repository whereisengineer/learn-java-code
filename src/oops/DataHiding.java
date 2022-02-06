package oops;

public class DataHiding {

    private int balance;
    private String name;
    private String aadhar;

//    GETTER METHODS

    public int getBalance(){
        return balance;
    }

    public String getName(){
        return name;
    }

    public String getAadhar(){
        return aadhar;
    }

//    SETTER METHODS

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAadhar(String aadhar){
        this.aadhar = aadhar;
    }

    public static void main(String[] args) {

        DataHiding details = new DataHiding();

        details.setBalance(10000);
        details.setName("gaur");
        details.setAadhar("100001");
    }





}
