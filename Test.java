import java.util.Arrays;
import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        /*Person j = new Person(22, "joseph");
        Person a = new Person(23,"alin");



        increaseAge(j);

        System.out.println(j.toString());*/
        /*String pame="tAcjBrx";
        String nor = pame.toLowerCase();
        System.out.println(nor);

        System.nanoTime();*/
        System.out.println(method1());

    }

    
     





    
}
class Person{
    public int age;
    public String name;

    public Person(int age, String name){
        this.age=age;
        this.name = name;
    }

    public String toString(){
        return "["+this.age+" : "+this.name+"]";
    }
}