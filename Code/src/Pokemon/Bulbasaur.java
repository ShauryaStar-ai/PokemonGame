package Pokemon;

import PokemonTypes.GrassType;

public class Bulbasaur extends GrassType {
    public Bulbasaur(int level) {
        super("Bulbasaur", level);
    }

    @Override
    public String attack() {
        return getName() + " uses Vine Whip!";
    }

    public String leafAttack() {
        return getName() + " uses Leaf Attack!";
    }

    @Override
    public String toString() {
        return "Bulbasaur Named " + getName();
    }
}
