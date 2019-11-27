import stock.Car;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> carsForSale;
    private ArrayList<Car> carsForHire;
    private ArrayList<Employee> staffMembers;
    private double dealerFunds;

    public Dealership(){
        this.carsForSale = new ArrayList<Car>();
        this.carsForHire = new ArrayList<Car>();
        this.staffMembers = new ArrayList<Employee>();
        this.dealerFunds = 0.00;
    }

    public ArrayList<Car> getCarsForSale(){
        return this.carsForSale;
    }

    public ArrayList<Car> getCarsForHire(){
        return this.carsForHire;
    }

    public ArrayList<Employee> getStaffMembers(){
        return this.staffMembers;
    }

    public double getDealerFunds(){
        return this.dealerFunds;
    }

}
