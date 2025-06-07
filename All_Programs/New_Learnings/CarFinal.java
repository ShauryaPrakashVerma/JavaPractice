import java.util.*;
public class CarFinal{

    final int noOfWheels;
    final String model;
    final String engineInLitres;

    public CarFinal(int noOfWheels, String model, String engineInLitres){
        this.noOfWheels= noOfWheels;
        this.model=model;
        this.engineInLitres=engineInLitres;
    } //after this constructort the fields in this class cant be changed because the are final.
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of wheels: ");
        int noOfWheels=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the model: ");
        String model=sc.nextLine();
        System.out.print("Enter the engine fuel Capacity: ");
        String engineInLitres=sc.next();

        CarFinal NewCar=new CarFinal(noOfWheels, model, engineInLitres);
        System.out.println("No of wheels:"+NewCar.noOfWheels);
        System.out.println("Model:"+NewCar.model);
        System.out.println("Engine Fuel Capacity:" + NewCar.engineInLitres);
    }
}