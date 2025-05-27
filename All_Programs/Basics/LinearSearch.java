import java.util.*;
class LinearSearch{
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array.");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element at index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be searched : ");
        int element=sc.nextInt();

        int index=0;

        for (int i = 0; i < size; i++) {
            if(element==arr[i])
                {
                    index=i;
                    break;
                }
        }

        if (index==0)
            System.out.println("Element not found in array.");
        else
            System.out.println("Element found in array at index "+index);
    }
}