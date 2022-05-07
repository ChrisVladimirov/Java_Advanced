package Exercise;

public class Person implements Comparable<Person> {
    private final String name;
    private final int age;
    private final String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    @Override
    public int compareTo(Person p2) {
        int result = this.name.compareTo(p2.name);
        if (result == 0) {
            result = Integer.compare(this.age, p2.age);
        }
        if (result == 0) {
            result = this.town.compareTo(p2.town);
        }
        return result;
    }
}
