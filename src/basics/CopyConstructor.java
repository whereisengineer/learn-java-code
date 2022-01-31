package basics;

public class CopyConstructor {

    int age;
    int salary;

    CopyConstructor(){
        age =27;
        salary=2000;
    }

    CopyConstructor(CopyConstructor c){
        age = c.age;
        salary = c.salary;
    }
    public static void main(String[] args) {
        CopyConstructor c1 = new CopyConstructor();
        System.out.println("c1 age and salary are " + c1.age + ", " + c1.salary);

        CopyConstructor c2 = new CopyConstructor(c1);
        System.out.println("c2 age and salary are " + c2.age + ", " + c2.salary);

    }
}
