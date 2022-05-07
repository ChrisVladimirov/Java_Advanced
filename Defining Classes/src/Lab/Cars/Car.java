package Lab.Cars;

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

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.%n",
                this.getBrand(),
                this.getModel(),
                this.getHorsePower());
    }

    /*@Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj){
            return  true;
        }
        if (obj instanceof Car){
            Car second = (Car) obj;
            return
                    this.brand.equals(brand)
                    && this.model.equals(model)
                    && this.horsePower == horsePower;
        }
    }*/

    public Car(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }
}
