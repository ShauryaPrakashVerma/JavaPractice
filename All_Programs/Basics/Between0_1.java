import java.util.*;
public class Between0_1{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter First Number:");
        double num1=sc.nextDouble();

        if(0<num1 && num1<1)
            System.out.println("The entered number lies strictly between 0 & 1");
        else
            System.out.println("The entered number does not lie strictly between 0 & 1");
    }
}