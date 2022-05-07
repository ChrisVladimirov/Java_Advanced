package Exercises.RawData;

public class Cargo {
    private final String type;
    private final int weight;

    public Cargo(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}
