import java.util.*;

public class SumDiagonal 
{
    public static void main(String... args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of rows and columns in the 2d array.");
        int rows = sc.nextInt();
        int col=sc.nextInt();
        int[][] arr = new int[rows][col];
        
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print("Enter the value at rows:"+i+" column:"+j+" -- ");
                arr[i][j]=sc.nextInt();
            }
        }

        int sum=0;
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(i==j)
                    sum = sum + arr[i][j];
            }
        }

        System.out.println("The sum of diagonal elements of the entered array is "+sum);
    }
}
