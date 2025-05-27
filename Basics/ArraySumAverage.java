import java.util.*;

public class ArraySumAverage{
    public static void main(String []args){
        
        int[] numArray= ArrayUtilty.inputArray();
        long sum= sum(numArray);
        int average= average(numArray);
        System.out.println("sum of the numbers is:"+sum);
        System.out.println("average of the numbers is:"+average);
    }

    public static long sum(int[] numArray){
        long sum=0;
        for(int i=0; i<numArray.length; i++){
            sum=sum+numArray[i];
        }
        return sum;
    }

    public static int average(int[] numArray){
        long sum= sum(numArray);
        int average=(int)(sum/numArray.length);
        return average;
    }
}