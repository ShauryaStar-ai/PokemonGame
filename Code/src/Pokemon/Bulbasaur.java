package Pokemon;

import Abstraction.PokemonBase;
import PokemonTypes.GrassType;

public class Bulbasaur extends GrassType {
    public Bulbasaur (String name, int level){
        super(name, level);
    }

    @Override
    public String Generalattack(PokemonBase pokemonAttacked) {
        if (pokemonAttacked.getHealth() <= 0){
            return "The pokemon attacked: "+pokemonAttacked+" has no more health thus cannot be attacked";
        }else{
        return getName()+" executed " + super.Generalattack(pokemonAttacked);}
    }


    public String leafAttack(PokemonBase pokemonAttacked) {
        if (pokemonAttacked.getHealth() <= 0) {
            return "The pokemon attacked: " + pokemonAttacked + " has no more health thus cannot be attacked";
        }
        double damage = 15;
        pokemonAttacked.giveDamageAfterAttack(damage);
        return getName() + " uses Leaf Attack! and caused damage of " + damage+" health points on "+pokemonAttacked;
    }

    @Override
    public String toString() {
        return "Bulbasaur Named " + getName();
    }
}
