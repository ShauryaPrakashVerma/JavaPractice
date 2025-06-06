import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        // Initializing a 2D array with values
        int[][] twodm = {
                {10, 20, 30},
                {40, 50, 60}
        };
        
        System.out.print("Original Array:\n");
        print_array(twodm);
        
        System.out.println("After changing the rows and columns of the said array:");
        transpose(twodm);
    }
    
    private static void transpose(int[][] twodm) {
     
        int[][] newtwodm = new int[twodm[0].length][twodm.length];
        for (int i = 0; i < twodm.length; i++) {
            for (int j = 0; j < twodm[0].length; j++) {
                newtwodm[j][i] = twodm[i][j];
            }
        }
        
        print_array(newtwodm);
    }
    private static void print_array(int[][] twodm) {
        for (int i = 0; i < twodm.length; i++) {
            for (int j = 0; j < twodm[0].length; j++) {
                System.out.print(twodm[i][j] + " ");
            }
            System.out.println();
        }
    }
} 