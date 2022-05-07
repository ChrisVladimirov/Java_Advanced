package Exercises.Google;

public class Child {
    private final String childName;
    private final String childBirthday;

    public Child(String childName, String childBirthday) {
        this.childName = childName;
        this.childBirthday = childBirthday;
    }

    @Override
    public String toString() {
        return childName + " " + childBirthday;
    }
}