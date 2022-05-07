package Exercise.StrategyPattern;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Person> peopleByName = new TreeSet<>(new NameComparator());
        Set<Person> peopleByAge = new TreeSet<>(new AgeComparator());

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            Person person = new Person(tokens[0], Integer.parseInt(tokens[1]));
            peopleByName.add(person);
            peopleByAge.add(person);
        }
        peopleByName.forEach(e -> System.out.print(e.toString()));
        peopleByAge.forEach(e -> System.out.print(e.toString()));
    }
}
