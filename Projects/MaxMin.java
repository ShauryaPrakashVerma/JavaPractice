import java.util.*;

public class MaxMin{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0; i<5; i++){
            System.out.print("Enter array element at " + i +":");
            arr[i]=sc.nextInt();
        }

        int min=0;
        int max = 0;
        for(int i=0; i<5; i++){
            if(arr[i]<min)
                min=arr[i];

            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("Maximum element in the array = "+max);
        System.out.println("Minimum element in the array = "+min);
    }
}