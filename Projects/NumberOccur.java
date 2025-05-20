import java.util.*;

public class NumberOccur{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0; i<5; i++){
            System.out.println("Enter array element at " + i +":");
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the number to be searched:");
        int num= sc.nextInt();
        int count=0;
        for(int i=0; i<5; i++){
            if (num==arr[i])
                count++;
        }
        System.out.println("The number of occurences of "+num+" in array are:"+count);

    }
}