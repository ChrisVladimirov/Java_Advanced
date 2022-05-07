package Lab.GenericScale;

public class Main {
    public static void main(String[] args) {
        Scale<String> scale = new Scale<>("a", "z");
        System.out.println(scale.getHeavier());

        Scale<Integer> scale1 = new Scale<>(13, 58);
        System.out.println(scale1.getHeavier());
    }
}
