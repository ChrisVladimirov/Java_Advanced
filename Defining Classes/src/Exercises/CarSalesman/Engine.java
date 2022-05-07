package Exercises.CarSalesman;

public class Engine {
    private final String model;
    private final String power;
    private final String displacement;
    private final String efficiency;

    public Engine(String model, String power, String displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public String getPower() {
        return power;
    }

    public String getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    @Override
    public String toString() {
        return String.format("%s:%n" +
                "Power: %s%n" +
                "Displacement: %s%n" +
                "Efficiency: %s%n", getModel(), getPower(), getDisplacement(), getEfficiency());
    }
}
