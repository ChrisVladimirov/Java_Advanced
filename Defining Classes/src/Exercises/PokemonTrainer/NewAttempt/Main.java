package Exercises.PokemonTrainer.NewAttempt;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Trainer> trainers = new ArrayList<>();
        String command = scanner.nextLine();

        /*while (!command.equals("Tournament")) {
            String[] tokens = command.split("\\s+");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);

            Trainer trainer = new Trainer(trainerName, new ArrayList<>());
            trainers.add(trainer);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            for (Trainer value : trainers) {
                value.getPokemons().add(pokemon);
            }
            command = scanner.nextLine();
        }*/
        while (!command.equals("Tournament")) {
            String[] tokens = command.split("\\s+");
            String trainerName = tokens[0];
            int index = -1;
            for (int i = 0; i < trainers.size(); i++) {
                if (trainers.get(i).getName().equals(trainerName)) {
                    index = i;
                }
            }
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            if (index != -1) {
                trainers.get(index).getPokemons().add(pokemon);
            } else {
                Trainer trainer = new Trainer(trainerName, 0, new ArrayList<>());
                trainers.add(trainer);
                trainers.get(trainers.size() - 1).getPokemons().add(pokemon);
            }
            command = scanner.nextLine();
        }

        command = scanner.nextLine();
        while (!command.equals("End")) {
            String element = command;

            for (Trainer currentTrainer : trainers) {
                boolean possessesTheElement = false;
                for (Pokemon currentPokemon : currentTrainer.getPokemons()) {
                    if (element.equals(currentPokemon.getElement()) && currentPokemon.getHealth() > 10) {
                        currentTrainer.increaseNumberBadges();
                        possessesTheElement = true;
                        break;
                    }
                }
                if (!possessesTheElement) {
                    for (Pokemon pokemon : currentTrainer.getPokemons()) {
                        pokemon.setHealth(pokemon.getHealth() - 10);
                        if (pokemon.getHealth() < 0) {
                            currentTrainer.getPokemons().remove(pokemon);
                        }
                    }
                }
            }
            command = scanner.nextLine();
        }
        trainers
                .stream()
                .sorted((a, b) ->
                        Integer.compare(b.getNumberBadges(), a.getNumberBadges()))
                .forEach(System.out::println);
    }
}
//<trainerName> <badges> <numberPokemons>