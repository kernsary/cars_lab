package staff;

import behaviours.IDrive;
import stock.Car;

import java.util.ArrayList;

public abstract class Employee implements IDrive {

    private String name;
    private ArrayList<Car> carsSold;
    private double salesIncome;

    public Employee(String name){
        this.name = name;
        this.carsSold = new ArrayList<Car>();
        this.salesIncome = 0.00;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Car> getCarsSold(){
        return this.carsSold;
    }

    public double getSalesIncome(){
        return this.salesIncome;
    }

    public String testDrive(Car newCar){
        return "I test drove a " + newCar.getModel();
    }

}
