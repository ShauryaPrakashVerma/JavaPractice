//Calculate the area and circumference of a circle for a given radius using Math.PI
import java.util.*;
class Circle{
    double radius;
    

    Circle(double radius){
        this.radius=radius;
    }

    double getCircumference(){
        return 2*radius*Math.PI;
    }

    double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    @Override
    public String toString(){
        return "Circle Props:\nRadius: "+radius
                        +",\nCircumference: "+getCircumference()
                        +",\nArea: "+getArea();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius=sc.nextDouble();
        Circle circle=new Circle(radius);
        System.out.println(circle);
    }
}