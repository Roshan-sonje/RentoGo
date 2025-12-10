public class Car {
    private int carId;
    private String brand;
    private String model;
    private String type;
    private String fuelType;
    private String transmission;
    private int seatCount;
    private double pricePerDay;
    private boolean isAvailable;

    public int getSetId(){
        return carId;
    }
    public String getBrand(){
        return brand;
    }
    public String getType(){
        return type;
    }
    public String getFuelType(){
        return fuelType;
    }
    public String getTransmission(){
        return transmission;
    }
    public int getSeatCount(){
        return seatCount;
    }
    public double getPricePerDay(){
        return pricePerDay;
    }
    public boolean getIsAvailable(){
        return isAvailable;
    }



    public void setCarId(int carId){
        this.carId = carId;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }
    public void setTransmission(String transmission){
        this.transmission = transmission;
    }
    public void setSeatCount(int seatCount){
        this.seatCount = seatCount;
    }
    public void setPricePerDay(double pricePerDay){
        this.pricePerDay = pricePerDay;
    }
    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    Car(int carId, String brand, String model, String type, String fuelType,
        String transmission, int seatCount, double pricePerDay, boolean isAvailable)
    {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.seatCount = seatCount;
        this.pricePerDay = pricePerDay;
        this.isAvailable = isAvailable;
    }

    public void getCar()
    {
        System.out.println("\n*** CAR INFO ***\n");
        System.out.println("Car Id : " + carId);
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Type : " + type);
        System.out.println("Fuel Type : " + fuelType);
        System.out.println("Transmission : " + transmission);
        System.out.println("Seat Count : " + seatCount);
        System.out.println("Price Per Day : " + pricePerDay);
        System.out.println("IsAvailable : " + isAvailable);
    }
}

//carId
//brand
//model
//type
//fuelType
//transmission
//seatCount
//pricePerDay
//isAvailable