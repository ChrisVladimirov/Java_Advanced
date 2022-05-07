/*
package Exercises.PokemonTrainer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, Trainer> trainers = new LinkedHashMap<>();

        while (!command.equals("Tournament")) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String trainerName = tokens[0];

            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            trainers.get(trainerName).addPokemon(pokemon);

            if (!trainers.containsKey(trainerName)) {
                trainers.put(trainerName, new Trainer());
            }
            command = scanner.nextLine();
        }

        String fightCommand = scanner.nextLine();
        while (!fightCommand.equals("End")) {
            for (var entry : trainers.entrySet()) {
                if (entry.getValue().pokeCollectionSize() > 0) {
                    boolean havePokemon = false;
                    for (Pokemon pokemon : entry.getValue().getPokemons()) {
                        if (pokemon.getElement().equals(fightCommand)) {
                            havePokemon = true;
                            entry.getValue().setNumOfBadges();
                            break;
                        }
                    }
                    if (!havePokemon) {
                        entry.getValue().missingPokemonPenalty();
                    }
                }
            }
            fightCommand = scanner.nextLine();
        }
        trainers.entrySet().stream()
                .sorted((b1, b2) -> Integer.compare(b2.getValue().getNumOfBadges(), b1.getValue().getNumOfBadges()))
                .forEach(t -> System.out.printf("%s %s %s%n", t.getKey(),
                        t.getValue().getNumOfBadges(),
                        t.getValue().pokeCollectionSize()));
    }
}
*/
