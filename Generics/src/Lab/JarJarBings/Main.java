package Lab.JarJarBings;

public class Main {
    public static void main(String[] args) {
        Jar<String> jar = new Jar<>();
        jar.add("cucumber");
        jar.add("pickle");
        jar.add("water");
        jar.add("pinch of salt");

        System.out.println(jar.remove());
        System.out.println(jar.remove());
        System.out.println(jar.remove());

    }
}
