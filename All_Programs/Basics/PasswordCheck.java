import java.util.*;
public class PasswordCheck{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        String password;
        do { 
            System.out.print("Enter your password: ");
            password=sc.nextLine();
        } while (!ValidatePassword(password));
    System.out.println("Thanks for entering a valid password");
    }

    public static boolean ValidatePassword(String password){
        return password.length()>=8;
    }
}
