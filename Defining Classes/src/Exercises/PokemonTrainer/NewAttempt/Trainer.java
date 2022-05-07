package Exercises.PokemonTrainer.NewAttempt;

import java.util.List;

public class Trainer {
    private final String name;
    private int numberBadges;
    private final List<Pokemon> pokemons;

    public Trainer(String name, int numberBadges, List<Pokemon> pokemons) {
        this.name = name;
        this.numberBadges = numberBadges;
        this.pokemons = pokemons;
    }

    public String getName() {
        return name;
    }

    public int getNumberBadges() {
        return numberBadges;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void increaseNumberBadges() {
        numberBadges++;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", getName(), getNumberBadges(), getPokemons().size());
    }
}
//<trainerName> <badges> <numberPokemons>