import java.util.*;

public class MergeArray {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays: ");
        int size = sc.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        // Input first array
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element at index " + i + ": ");
            arr1[i] = sc.nextInt();
        }

        // Input second array
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element at index " + i + ": ");
            arr2[i] = sc.nextInt();
        }

        // Merging arrays
        int[] merged_array = new int[size * 2];
        for (int i = 0; i < size; i++) {
            merged_array[i] = arr1[i];
            merged_array[size + i] = arr2[i];
        }

        // Output merged array
        System.out.println("Merged Array:");
        for (int i = 0; i < merged_array.length; i++) {
            System.out.println(merged_array[i]);
        }
    }
}
