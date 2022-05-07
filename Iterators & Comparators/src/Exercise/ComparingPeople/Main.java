package Exercise.ComparingPeople;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        String command;
        while (!"END".equals(command = scanner.nextLine())) {
            String[] tokens = command.split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String town = tokens[2];

            Person person = new Person(name, age, town);
            people.add(person);
        }
        int identicalPeople = 0;

        int index = scanner.nextInt();
        Person searchedPerson = people.get(index - 1);
        for (Person person : people) {
            if (person.compareTo(searchedPerson) == 0) {
                identicalPeople++;
            }
        }
        System.out.println(identicalPeople == 1 ? "No matches" : String.format("%d %d %d", identicalPeople, people.size() - identicalPeople, people.size()));
    }
}