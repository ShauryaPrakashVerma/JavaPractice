import java.util.*;
class TableforLoop{
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose table is to be displayed.");
        int num= sc.nextInt();
        for(int i=1; i<10; i++){
            System.out.println(num +" * "+ i+" = "+(num*i));
        }
    }
}