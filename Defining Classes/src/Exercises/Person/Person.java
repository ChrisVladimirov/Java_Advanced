package Exercises.Person;

public class Person {
    //fields
    private String name;
    private int age;

    //methods

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //constructors:
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
