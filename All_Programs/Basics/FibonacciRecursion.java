import java.util.*;
class FibonacciRecursion{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of terms you want in the fibonacci series: ");
        int terms=sc.nextInt();
        FibonacciRecursion obj =new FibonacciRecursion();
        for(int i=1; i<terms; i++){
            System.out.print(obj.FibonacciRecursion(i)+" ");
        }
        
    }

    public int FibonacciRecursion(int position){
        if(position==1){
            return 0;
        }
        if(position==2){
            return 1;
        }
        return FibonacciRecursion(position-1) +FibonacciRecursion(position-2);
    }
}