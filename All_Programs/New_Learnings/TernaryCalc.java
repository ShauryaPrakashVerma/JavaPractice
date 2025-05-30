import java.util.*;
public class TernaryCalc{
    public static void main(String...args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();
    
        System.out.println("""

        Enter 1 for addition
        Enter 2 for subtraction
        Enter 3 for multiplication
        Enter 4 for division

        """);
        int choice=sc.nextInt();

        TernaryCalc obj=new TernaryCalc();
        double value=obj.switchCalc(choice, num1 , num2);
        System.out.println( value==-3.14? "Invalid Choice": "The value is "+value );
    }

    public double switchCalc(int choice, int num1, int num2){
        return switch(choice){
            case 1 -> num1+num2;
            case 2 -> num1-num2;
            case 3 -> num1*num2;
            case 4 -> num1/num2;
            default -> -3.14;
        };
    }
}