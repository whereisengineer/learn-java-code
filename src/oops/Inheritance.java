package oops;

//    Parent Class
    class Bicycle{

        public int gear;
        public int speed;


        Bicycle(int gear , int speed){
            this.gear = gear;
            this.speed = speed;
        }

        public void applyBrake(int decrement){
            speed -= decrement;
        }

        public void speedUp(int increment){
            speed += increment;
        }

//        toString method to print the info of Bicycle
        public String toString(){
            return ("No of gears are "+ gear + "\n" + "speed of bicycle is "+ speed);
        }
    }

//    Child Class
    class MountainBike extends Bicycle{

        public int seatHeight;

        public MountainBike(int gear, int speed, int seatHeight){
            super(gear, speed);
            this.seatHeight = seatHeight;
        }

        public void setHeight(int newValue) {
            seatHeight = newValue;
        }

        //Overriding toString method of Bicycle class
        public String toString(){
            return (super.toString() + "\n Seat height is " + seatHeight);
        }

}
//driver class
    public class Inheritance {

    public static void main(String[] args) {

        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
        System.out.println("gear is "+ mb.gear); //Accessing the field of parent class with the object of child class.
        mb.applyBrake(10); // Accessing the method of parent class with the object of child class.
        System.out.println("speed is " + mb.speed);


    }
}
