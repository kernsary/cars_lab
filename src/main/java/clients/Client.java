package clients;

import behaviours.IDrive;
import stock.Car;

public abstract class Client implements IDrive {

    protected String name;
    protected double budget;

    public Client(String name, double budget){
        this.name = name;
        this.budget = budget;
    }

    public String getName(){
        return this.name;
    }

    public double getBudget(){
        return this.budget;
    }

    public String testDrive(Car newCar){
        return "I test drove a " + newCar.getModel();
    }

    public abstract void buyCar(Car car);

    public abstract void hireCar(Car car);

}
