package basics;

public class StaticBlock {

    StaticBlock(){
        System.out.println("Constructor called.");
    }

    public static int staticMethod(){
        System.out.println("Static Method Called.");
        return 1;
    }


    static {
        System.out.println("Static block called.");
    }

    static int i = staticMethod();

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
    }
}
