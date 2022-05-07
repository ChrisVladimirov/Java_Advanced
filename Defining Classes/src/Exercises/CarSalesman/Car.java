package Exercises.CarSalesman;

public class Car {
    private final String model;
    private final Engine engine;
    private final String weight;
    private final String color;

    public Car(String model, Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    /*@Override
    public String toString() {
        return String.format("""
                %s:
                %s:
                Power: %s
                Displacement: %s
                Efficiency: %s
                Weight: %s
                Color: %s""", getModel(), getEngine().getModel(), getEngine().getPower(), getEngine().getDisplacement(), getEngine().getEfficiency(), getWeight(), getColor());
    }*/
    @Override
    public String toString() {
        return String.format("%s:%n" +
                "%s" +
                "Weight: %s%n" +
                "Color: %s", getModel(), getEngine().toString(), getWeight(), getColor());
    }
}
