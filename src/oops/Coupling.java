package oops;

class Subject{

    Topic t = new Topic();  //Tight Coupling starts here.
    public void startReading(){
        t.understand();
    }

}

class Topic{
    public void understand(){
        System.out.println("Tight Coupling Concept");
    }
}

public class Coupling {

    public static void main(String[] args) {
        Subject sub = new Subject();
        sub.startReading();
    }
}
