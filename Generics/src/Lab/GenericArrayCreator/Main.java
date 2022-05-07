package Lab.GenericArrayCreator;

public class Main {
    public static void main(String[] args) {
        String[] strings = ArrayCreator.
                <String>create(String.class, 5, "notNull Object Value");
        System.out.println();

        Integer[] integers = ArrayCreator.<Integer>create(Integer.class, 73, 69);

    }
}
