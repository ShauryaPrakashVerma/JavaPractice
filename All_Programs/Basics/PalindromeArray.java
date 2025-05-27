import java.util.*;

public class PalindromeArray {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] rev_arr = new int[size];

        // Input elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Reverse array
        for (int i = 0; i < size; i++) {
            rev_arr[i] = arr[size - 1 - i];
        }

        // Compare
        boolean isPalindrome = true;
        for (int i = 0; i < size; i++) {
            if (arr[i] != rev_arr[i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("Palindrome Array");
        else
            System.out.println("Not Palindrome Array");
    }
}
