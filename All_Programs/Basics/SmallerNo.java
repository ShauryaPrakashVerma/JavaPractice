import java.util.*;
public class SmallerNo{
    public static void main(String...args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();

        SmallerNo small=new SmallerNo();
        int min= small.min(num1, num2);
        System.out.println("Minimum number is "+min);
    }

    public int min(int num1, int num2){
        return num1>num2? num2: num1;
    }
}