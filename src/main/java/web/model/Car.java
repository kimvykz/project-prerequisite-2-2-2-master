package web.model;

public class Car {
    private String brand;
    private String model;
    private int maxSpeed;

    public Car(){

    }
    public Car(String brand, String model, int maxSpeed){
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
