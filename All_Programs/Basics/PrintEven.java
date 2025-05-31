import java.util.*;
class PrintEven{
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        int[] numArr=new int[5];
        for( int i=0; i<numArr.length; i++){
            System.out.print("Enter array element at index "+i+": ");
            numArr[i]=sc.nextInt();
        }
        int sum=0;
        for( int i=0; i<numArr.length; i++){
            if(numArr[i]%2!=0)
                continue;
            
            System.out.print(numArr[i]+" ");
        }
    }
}