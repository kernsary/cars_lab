package stock;

public abstract class Car {

    private String model;
    private String make;
    private String colour;
    private EngineType engineType;
    private double price;
    private double rentalPrice;

    public Car(String model, String make, String colour, EngineType engineType, double price, double rentalPrice){
        this.model = model;
        this.make = make;
        this.colour = colour;
        this.engineType = engineType;
        this.price = price;
        this.rentalPrice = rentalPrice;
    }

    public String getModel(){
        return this.model;
    }

    public String getMake(){
        return this.make;
    }

    public String getColour(){
        return this.colour;
    }

    public EngineType getEngineType(){
        return this.engineType;
    }

    public double getPrice(){
        return this.price;
    }

    public double getRentalPrice(){
        return this.rentalPrice;
    }


}
