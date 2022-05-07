package Exercises.RawData;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private String model;
    private Exercises.RawData.Engine engine;
    private Exercises.RawData.Cargo cargo;
    private final List<Exercises.RawData.Tyre> tyres;

    public Vehicle() {
        this.tyres = new ArrayList<>();
    }

    public void setCargo(Exercises.RawData.Cargo cargo) {
        this.cargo = cargo;
    }

    public Exercises.RawData.Cargo getCargo() {
        return cargo;
    }

    public List<Exercises.RawData.Tyre> getTyres() {
        return tyres;
    }

    public Exercises.RawData.Engine getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Exercises.RawData.Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", cargo=" + cargo +
                ", tyres=" + tyres +
                '}';
    }
}
