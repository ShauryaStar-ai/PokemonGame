package PlayingGame;

import java.util.Scanner;
import Abstraction.PokemonBase;

public class ControlFlow {
    public static void main(String[] args) throws InterruptedException {
        Player ash = new Player("Ash");
        RandomPokemonGenerator generator = new RandomPokemonGenerator();
        generator.start();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            PokemonBase wildPokemon = generator.getCurrentWildPokemon();

            if (wildPokemon != null) {
                System.out.println("\nA wild " + wildPokemon + " is here!");
                System.out.println("Do you want to try to catch it? (yes/no/quit)");

                if (!scanner.hasNextLine()) {
                    break; // Defensive check if input stream closes
                }

                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("yes")) {
                    ash.catchPokemon(wildPokemon, scanner);
                } else if (input.equalsIgnoreCase("no")) {
                    System.out.println("You decided not to catch " + wildPokemon.getName() + ".");
                } else if (input.equalsIgnoreCase("quit")) {
                    System.out.println("Thanks for playing!");
                    generator.stopSpawning(); // Stop the background thread
                    break;
                }

                ash.showPokemon();
                System.out.println("Waiting for the next wild Pokémon...");
                Thread.sleep(12000); // Wait longer than spawn delay
            } else {
                System.out.println("Waiting for a wild Pokémon to appear...");
                Thread.sleep(2000);
            }
        }

        scanner.close();
    }
}
