//Define a class student class with fiels like name and age, and use toString to print student details.
import java.util.*;
public class Student{
    String name;
    int age;
    String rollNo;
    String house;

    Student(String name, int age, String rollNo, String house){
        this.name =name;
        this.age =age;
        this.rollNo =rollNo;
        this.house = house;
    }

    @Override
    public String toString(){
        return "Student details : {name:"+name
                                + ", age: "+age
                                +", rollNo: "+rollNo
                                +", house:"+house+" }";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        String StdName=sc.next();
        System.out.print("Enter the age of the student: ");
        int age=sc.nextInt();
        System.out.print("Enter the roll number of the student: ");
        String roll=sc.next();
        System.out.print("Enter the house of the student: ");
        String house=sc.next();

        Student student1 = new Student(StdName, age, roll ,house);
        System.out.println(student1);
    }
    
}