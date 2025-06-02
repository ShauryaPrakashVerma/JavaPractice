class CarFinal{

    final int noOfWheels;
    final String model;
    final String engineInLitres;

    CarFinal(int noOfWheels, String model, String engineInLitres){
        this.noOfWheels=noOfWheels;
        this.model=model;
        this.engineInLitres =engineInLitres;
    }

    public static void main(String[] args) {
        CarFinal car=new CarFinal(4,"4bc","50L");
        System.out.println(car.noOfWheels);
        System.out.println(car.model);
        System.out.println(car.engineInLitres);
    }
}