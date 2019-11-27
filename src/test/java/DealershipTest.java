import clients.Customer;
import org.junit.Before;
import org.junit.Test;
import staff.Salesperson;
import stock.EngineType;
import stock.SUV;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealer;
    private SUV suv;
    private Salesperson salesperson;
    private Customer customer;

    @Before
    public void before(){
        dealer = new Dealership();
        suv = new SUV("Yeti", "Skoda", "Black", EngineType.DIESEL, 17000.00, 500.00);
        salesperson = new Salesperson("Julie Watts");
        customer = new Customer("Billy Weir", 20000.00);
    }

    @Test
    public void canAddCarForSale(){
        dealer.addCarForSale(suv);
        assertEquals(1, dealer.getCarsForSale().size());
    }

    @Test
    public void canAddCarForHire(){
        dealer.addCarForHire(suv);
        assertEquals(1, dealer.getCarsForHire().size());
    }

    @Test
    public void canSellCar(){
        dealer.addCarForSale(suv);
        dealer.sellCar(suv, customer);
        assertEquals(0, dealer.getCarsForSale().size());
        assertEquals(suv, customer.getCar());
        assertEquals(3000.00, customer.getBudget(), 0.01);
        assertEquals(17000.00, dealer.getDealerFunds(), 0.01);
    }

    @Test
    public void canHireCar(){
        dealer.addCarForHire(suv);
        dealer.hireCar(suv, customer);
        assertEquals(0, dealer.getCarsForHire().size());
        assertEquals(suv, customer.getCar());
        assertEquals(19500.00, customer.getBudget(), 0.01);
        assertEquals(500.00, dealer.getDealerFunds(), 0.01);
    }

    @Test
    public void canAddEmployee(){
        dealer.addEmployee(salesperson);
        assertEquals(1, dealer.getStaffMembers().size());
    }

    @Test
    public void canAddFunds(){
        dealer.changeFunds(100);
        assertEquals(100, dealer.getDealerFunds(), 0.01);
    }

    @Test
    public void customerCanTestDrive() {
        assertEquals("I test drove a Yeti", dealer.arrangeTestDrive(customer, suv));
        assertEquals(1, dealer.getTestDrivers().size());
    }

    @Test
    public void employeeCanTestDrive() {
        assertEquals("I test drove a Yeti", dealer.arrangeTestDrive(salesperson, suv));
        assertEquals(1, dealer.getTestDrivers().size());
    }

}
