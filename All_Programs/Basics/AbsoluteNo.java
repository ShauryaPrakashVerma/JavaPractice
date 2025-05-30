import java.util.*;
public class AbsoluteNo{
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num=sc.nextDouble();

        AbsoluteNo obj= new AbsoluteNo();
        double absValue= obj.CalcAbsValue(num);
        System.out.print("The absolute value of the number entered is "+absValue);
    }

    public double CalcAbsValue(double num){
        return (num>0)? num : -num; 
    }
}