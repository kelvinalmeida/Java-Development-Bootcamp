package model;

public class Car {

    private String make;
    private String model;
    private BodyType bodyType;  // Should this really be a String?
    private int productionYear;
    private double price;


    public static final int MINIMUN_YEAR = 1900;
    public static final int PRICE_LESS_THAN = 0;
    public static final int PRICE_GREATER_THAN = 200000;


    public Car(String make, String model, BodyType bodyType, int productionYear, double price) {
        setMake(make);
        setModel(model);
        setBodyType(bodyType);
        setProductionYear(productionYear);
        setPrice(price);
    }

    public Car(Car source) {
        setMake(source.make);
        setModel(source.model);
        setBodyType(source.bodyType);
        setProductionYear(source.productionYear);
        setPrice(source.price);
    }


    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        if( make.isEmpty() || make == null ) {
            throw new IllegalArgumentException("Make cannot be null or blank.");
        }

        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        if( model.isEmpty() || model == null ) {
            throw new IllegalArgumentException("Model cannot be null or blank.");
        }

        this.model = model;
    }
     
    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        if (bodyType == null) {
            throw new IllegalArgumentException("BodyType cannot be null.");
        }

        this.bodyType = bodyType;
    }


    public int getProductionYear() {
        return this.productionYear;
    }

    public void setProductionYear(int productionYear) {
        if(productionYear < MINIMUN_YEAR) {
            throw new IllegalArgumentException("Production year must be greater than or equal to the minimum year."); 
        }

        this.productionYear = productionYear;
    }


    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        
        if( PRICE_GREATER_THAN < price || price < PRICE_LESS_THAN) {
            throw new IllegalArgumentException("Price must be within a valid range."); 
        }

        this.price = price;
    }
}