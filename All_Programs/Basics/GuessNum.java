//Create a number guessing game where the program selects a randpm number, and the user has to get it.
import java.util.*;
class GuessNum{

    int random;

    GuessNum(){
        random= (int) Math.ceil(Math.random()*100);
    }

    /**
     * @param guessNo the number that the player guessed
     * -ve if the guessed number is smaller
     * 0 if the guessed number is correct
     * +ve if the guessed number is higher
     */

    int guess(int guessNo){
       return guessNo - random;
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GuessNum game=new GuessNum();
        int guess;
        int result;
        do { 
            System.out.println("Guess the number:");
            guess =sc.nextInt();
            result =game.guess(guess);
            if(result==0)
                System.out.println("Congratulations!! Correct guess");
            else if(result<0)
                System.out.println("Oops!! Wrong guess. Guess Higher.");
            else
                System.out.println("Oops!! Wrong guess. Guess lower.");
        } while (result!=0);
    }
}