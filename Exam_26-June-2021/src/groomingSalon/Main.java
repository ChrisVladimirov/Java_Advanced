package groomingSalon;

public class Main {
    public static void main(String[] args) {
        GroomingSalon salon = new GroomingSalon(20);
        Pet dog = new Pet("Jonny", 5, "Gosho");
        System.out.println(dog);

        salon.add(dog);
        System.out.println(salon.remove("Jonny"));
        System.out.println(salon.remove("Pufa"));

        Pet cat = new Pet("Mewocho", 2, "Me");
        salon.add(cat);
        salon.add(dog);

        System.out.println(salon.getPet("Mewocho", "Me"));
        System.out.println(salon.getStatistics());
    }
}