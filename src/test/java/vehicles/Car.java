package vehicles;

public class Car {

    private String model;
    private int yeah;

    public Car(String model, int yeah)
    {
        this.model = model;
        this.yeah = yeah;

        System.out.println("vehicles.Car constuctor called");
    }

}
