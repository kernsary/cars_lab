package staff;

import stock.Car;

import java.util.ArrayList;

public abstract class Employee {

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

}
