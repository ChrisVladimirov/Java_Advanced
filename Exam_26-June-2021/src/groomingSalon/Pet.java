package groomingSalon;

public class Pet {
    private String name;
    private int age;
    private String owner;

    public Pet(String name, int age, String owner) {
        this.setName(name);
        this.setAge(age);
        this.setOwner(owner);
    }

    @Override
    public String toString() {
        return String.format("%s %d - (%s)%n", this.getName(), this.getAge(), this.getOwner());
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid age!");
        }
    }

    public String getOwner() {
        return this.owner;
    }

    private void setOwner(String owner) {
        this.owner = owner;
    }
}
