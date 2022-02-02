package basics;

public class FinalVariable {

    final int finalInstVar;

    FinalVariable(){
        finalInstVar = 0;
    }

    FinalVariable(int var){
        finalInstVar = 1;
    }



    public static void main(String[] args) {

        FinalVariable obj2 = new FinalVariable(1);
        System.out.println(obj2.finalInstVar);


        FinalVariable obj = new FinalVariable();
        System.out.println(obj.finalInstVar);
    }
}
