package PlayingGame;
import Abstraction.PokemonBase;
import Pokemon.*;
import java.util.Random;

public class RandomPokemonGenerator extends Thread {
    private boolean running = true;
    private Random random = new Random();
    @Override
    public void run() {
        while (running) {
            // Generate a random Pokémon
            PokemonBase wildPokemon = getRandomPokemon();
            System.out.println("🌟 A  " + wildPokemon.getName() + " (Level "
                    + wildPokemon.getLevel() + ") appeared!");

            // Sleep for a few seconds before spawning the next one
            try {
                Thread.sleep(10000); // 5 seconds
            } catch (InterruptedException e) {
                System.out.println("Spawning interrupted!");
            }
        }
    }
    public void stopSpawning() {
        running = false;
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