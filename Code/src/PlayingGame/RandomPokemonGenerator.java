package PlayingGame;

import Abstraction.PokemonBase;
import Pokemon.*;
import java.util.Random;

public class RandomPokemonGenerator extends Thread {
    private boolean running = true;
    private volatile PokemonBase currentWildPokemon;
    private Random random = new Random();

    public PokemonBase getCurrentWildPokemon() {
        return currentWildPokemon;
    }

    public void stopSpawning() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {
            currentWildPokemon = getRandomPokemon();
            System.out.println("🌟 A wild " + currentWildPokemon + " appeared!");

            try {
                Thread.sleep(10000); // Spawn every 10 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private PokemonBase getRandomPokemon() {
        int level = random.nextInt(99) + 1;
        int choice = random.nextInt(3);

        switch (choice) {
            case 0:
                return new Bulbasaur("Wild Bulbasaur", level);
            case 1:
                return new Charlizard("Wild Charmander", level);
            case 2:
                return new Squirtle("Wild Squirtle", level);
            default:
                return new Bulbasaur("Wild Bulbasaur", level);
        }
    }
}
