package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator{
    public static void main(String[] args) {
        Circle cir =new Circle(5.5);
        Rectangle rect=new Rectangle(10,5);

        double circArea= Math.PI * Math.pow(cir.radius,2);
        double rectArea= rect.length*rect.breadth;

        System.out.println("Area of the circle is "+circArea);
        System.out.println("Area of the rectangle is "+rectArea);
    }
}
