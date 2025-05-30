import java.util.*;
public class EvenOdd{
    public static void main(String...args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1=sc.nextInt();

        EvenOdd obj= new EvenOdd();
        boolean check= obj.CheckEvenOdd(num1);
        System.out.println( check? "Even": "Odd");
    }

    public boolean CheckEvenOdd(int num1){
        return (num1%2==0)? true: false;

    }
}