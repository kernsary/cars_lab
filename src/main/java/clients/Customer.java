package clients;

import stock.Car;

public class Customer extends Client {

    private Car car;

    public Customer(String name, double budget){
        super(name, budget);
        this.car = null;
    }

    public Car getCar(){
        return this.car;
    }

    public void buyCar(Car newCar){
        this.car = newCar;
        this.budget -= newCar.getPrice();
    }

    public void hireCar(Car newCar){
        this.car = newCar;
        this.budget -= newCar.getRentalPrice();
    }

}
