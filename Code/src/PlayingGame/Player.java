package PlayingGame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import Abstraction.PokemonBase;

public class Player {
    private String name;
    private ArrayList<PokemonBase> pokemonCollection;

    public Player(String name) {
        this.name = name;
        this.pokemonCollection = new ArrayList<>();
    }

    public void catchPokemon(PokemonBase p, Scanner scanner) {
        if (p == null) {
            System.out.println("No wild Pokémon to catch right now.");
            return;
        }

        Random random = new Random();
        double healthRatio = p.getHealth() / 100.0;
        double catchChance = 0.7 * (1 - healthRatio);

        System.out.println("Attempting to catch " + p + "...");

        if (random.nextDouble() < catchChance) {
            System.out.println("You caught " + p.getName());
            System.out.println("Name your new Pokémon:");
            if (scanner.hasNextLine()) {
                String nickname = scanner.nextLine();
                p.setName(nickname);
            }
            pokemonCollection.add(p);
            System.out.println("You named it: " + p.getName());
        } else {
            System.out.println("The Pokémon " + p.getName() + " escaped.");
        }
    }

    public void showPokemon() {
        System.out.println(name + "'s Pokémon collection:");
        for (PokemonBase p : pokemonCollection) {
            System.out.println("- " + p);
        }
    }
}
