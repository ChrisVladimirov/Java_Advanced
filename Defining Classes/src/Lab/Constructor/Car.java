package Lab.Constructor;

import java.util.Objects;

public class Car {
    public String brand;
    public String model;
    public int horsePower;

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

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public Car() {

    }

    public Car(String brand) {
        this(brand, "unknown", -1);
    }

    public Car(String brand, String model) {
        this(brand, model, -1);
    }

    public Car(String model, int horsePower) {
        this("unknown", model, horsePower);
    }

    public Car(String brand, String model, int horsePower) {
        this.setBrand(brand);
        this.setModel(model);
        this.setHorsePower(horsePower);
    }

    public String getInfo() {
        return toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return horsePower == car.horsePower && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, horsePower);
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.",
                this.getBrand(),
                this.getModel(),
                this.getHorsePower());
    }
}