package Exercises.RawData;

public class Tyre {
    private final double pressure;
    private final int age;

    public Tyre(double pressure, int age) {
        this.pressure = pressure;
        this.age = age;
    }

    public double getPressure() {
        return pressure;
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "pressure=" + pressure +
                ", age=" + age +
                '}';
    }
}
