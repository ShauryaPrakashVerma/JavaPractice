public class ForEach{
    public static void main(String...args){
        int[] arr={2,3,5,6,7};
        int max=0;
        for( int num: arr){
            if (num>max) 
                max=num;
        }
        System.out.print("Maximum element in array is: "+max);
    }
}