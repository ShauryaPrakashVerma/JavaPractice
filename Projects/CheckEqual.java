import java.util.*;

public class CheckEqual{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input first Number:");
        int num1=sc.nextInt();
        System.out.print("Input second Number:");
        int num2=sc.nextInt();
        System.out.print("Input third Number:");
        int num3=sc.nextInt();
        System.out.print("Input fourth Number:");
        int num4=sc.nextInt();
        if (num1==num2 && num2==num3 && num3==num4)
            System.out.println("Entered numbers are equal");
        else
            System.out.println("Entered numbers are not equal");
    }
}