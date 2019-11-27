import staff.Employee;
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

    public void addCarForSale(Car car){
        this.carsForSale.add(car);
    }

    public void sellCar(Car car){
        if(this.carsForSale.contains(car)){
            this.carsForSale.remove(car);
        }
    }

    public void addCarForHire(Car car){
        this.carsForHire.add(car);
    }

    public void hireCar(Car car){
        if(this.carsForHire.contains(car)){
            this.carsForHire.remove(car);
        }
    }

    public void addEmployee(Employee employee){
        this.staffMembers.add(employee);
    }

    public void changeFunds(int amount){
        this.dealerFunds += amount;
    }

}
