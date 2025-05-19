import java.util.*;
public class ArrayUtility{
    public static int[] inputArray(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the size of the array:");
        int size=sc.nextInt();
        int[] arr= new int[size];
        for(int i=0; i<size; i++)
        {
            System.out.println("Please enter element at position "+ (i+1)+ ":");
            arr[i]= sc.nextInt();
        }
        return arr;
    }
}