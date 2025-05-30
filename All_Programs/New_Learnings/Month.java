//Program to print month of the user depending on user input by using SWITCH EXPRESSION

import java.util.*;
public class Month{
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();

        String month= switch(num){
            case 1 ->"January";
            case 2 ->"Feburary";
            case 3 ->"March";
            case 4 ->"April";
            case 5 ->"May";
            case 6 ->"June";
            case 7 ->"July";
            case 8 ->"August";
            case 9 ->"September";
            case 10 ->"October";
            case 11 ->"November";
            case 12 ->"December";
            default ->"Invalid Choice. Please try Again.";
        };

        System.out.println("The Month is "+month);
    }
}