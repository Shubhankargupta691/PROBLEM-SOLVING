import java.sql.SQLOutput;

class Students {
    String name;
    int age;

public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
}
    Students(String name , int age){
        this.name = name;
        this.age = age;
    }
}
public class Main {
    public static void main(String args[]) {
        Students sc = new Students("Tony" ,12);
        sc.printInfo();
    }
}