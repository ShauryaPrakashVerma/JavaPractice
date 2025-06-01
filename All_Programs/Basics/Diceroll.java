//Program to simulate a dice roll using Math.random() and display the outcome (1 to 6)
public class Diceroll{

    int roll(){
        double random=Math.random()*6;
        int roll=(int) Math.ceil(random);
        return roll;
    }
    public static void main(String...args){
        Diceroll dice=new Diceroll();
        
        for (int i = 0; i < 10; i++) {
            System.out.println(dice.roll());
        }
        
    }
}