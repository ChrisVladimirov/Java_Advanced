package Exercises.Google;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private Exercises.Google.Company company;
    private Exercises.Google.Car car;

    private final List<Exercises.Google.Parent> parents;
    private final List<Exercises.Google.Child> children;
    private final List<Exercises.Google.Pokemon> pokemons;

    public Person() {
        this.parents = new ArrayList<>();
        this.pokemons = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public void setCompany(Exercises.Google.Company company) {
        this.company = company;
    }

    public void setCar(Exercises.Google.Car car) {
        this.car = car;
    }

    public List<Exercises.Google.Pokemon> getPokemons() {
        return this.pokemons;
    }

    public List<Exercises.Google.Parent> getParents() {
        return this.parents;
    }

    public List<Exercises.Google.Child> getChildren() {
        return this.children;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Company:").append("\n");
        if (company != null) {
            builder.append(company.toString()).append("\n");
        }

        builder.append("Car:").append("\n");
        if (car != null) {
            builder.append(car.toString()).append("\n");
        }


        builder.append("Pokemon:").append("\n");
        for (Exercises.Google.Pokemon pokemon : pokemons) {
            builder.append(pokemon.toString()).append("\n");
        }

        builder.append("Parents:").append("\n");
        for (Exercises.Google.Parent parent : parents) {
            builder.append(parent.toString()).append("\n");
        }

        builder.append("Children:").append("\n");
        for (Exercises.Google.Child child : children) {
            builder.append(child.toString()).append("\n");
        }

        return builder.toString();
    }
}