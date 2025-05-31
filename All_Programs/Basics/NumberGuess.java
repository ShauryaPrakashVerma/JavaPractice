import java.util.*;
public class NumberGuess{
    static int guess=10;
    public static void main(String...args){
        int num=10;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the number guessing game.");
        do { 
            if(guess!=num){
                System.out.println("Oops! Wrong guess. Try again.");
            }
            System.out.print("Enter your guess: ");
            guess=sc.nextInt();
        } while (guess!=num);
        System.out.println("Congratulations!! You guessed it correctly.");
    }
}