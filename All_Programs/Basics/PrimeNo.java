import java.util.*; 
public class PrimeNo{
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num=sc.nextInt();

        boolean flag = isPrime(num);
        System.out.println( flag? "The entered number is prime":"The entered number is not prime.");
    }

    public static boolean isPrime(int num){
        int count=0;
        for(int i=1; i<=num; i++)
        {
            if(num%i==0) count++;
        }
        return count==2;
    }
}