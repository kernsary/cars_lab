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

    @Before
    public void before(){
        dealer = new Dealership();
        suv = new SUV("Yeti", "Skoda", "Black", EngineType.DIESEL, 17000.00, 500.00);
        salesperson = new Salesperson("Julie Watts");
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
        dealer.sellCar(suv);
        assertEquals(0, dealer.getCarsForSale().size());
    }

    @Test
    public void canHireCar(){
        dealer.addCarForHire(suv);
        dealer.hireCar(suv);
        assertEquals(0, dealer.getCarsForHire().size());
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


}
