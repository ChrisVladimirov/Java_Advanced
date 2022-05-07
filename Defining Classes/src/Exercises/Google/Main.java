package Exercises.Google;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Exercises.Google.Person> personData = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] parameters = input.split("\\s+");
            String name = parameters[0];

            if(!personData.containsKey(name)) {
                personData.put(name, new Exercises.Google.Person());
            }
            String dataEntered = parameters[1];
            switch (dataEntered) {
                case "company" -> {
                    String companyName = parameters[2];
                    String department = parameters[3];
                    double salary = Double.parseDouble(parameters[4]);
                    Exercises.Google.Company company = new Exercises.Google.Company(companyName, department, salary);
                    personData.get(name).setCompany(company);
                }
                case "pokemon" -> {
                    String pokemonName = parameters[2];
                    String pokemonType = parameters[3];
                    Exercises.Google.Pokemon pokemon = new Exercises.Google.Pokemon(pokemonName, pokemonType);
                    personData.get(name).getPokemons().add(pokemon);
                }
                case "parents" -> {
                    String parentName = parameters[2];
                    String parentBirthDay = parameters[3];
                    Exercises.Google.Parent parent = new Exercises.Google.Parent(parentName, parentBirthDay);
                    personData.get(name).getParents().add(parent);
                }
                case "children" -> {
                    String childName = parameters[2];
                    String childBirthday = parameters[3];
                    Exercises.Google.Child child = new Exercises.Google.Child(childName, childBirthday);
                    personData.get(name).getChildren().add(child);
                }
                case "car" -> {
                    String model = parameters[2];
                    int velocity = Integer.parseInt(parameters[3]);
                    Exercises.Google.Car car = new Exercises.Google.Car(model, velocity);
                    personData.get(name).setCar(car);
                }
            }
            input = scanner.nextLine();
        }
        String personSearched = scanner.nextLine();
        System.out.println(personSearched);
        Exercises.Google.Person personalData = personData.get(personSearched);
        System.out.println(personalData);
    }
}