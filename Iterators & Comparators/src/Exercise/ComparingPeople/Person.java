package Exercise.ComparingPeople;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        setAge(age);
        this.town = town;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Not a valid age type!");
        }
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    private void setTown(String town) {
        this.town = town;
    }

    @Override
    public int compareTo(Person o) {
        int result = this.name.compareTo(o.getName());
        if (result == 0) {
            result = Integer.compare(this.age, o.getAge());
            if (result == 0) {
                result = this.town.compareTo(o.getTown());
            }
        }
        return result;
    }
}
