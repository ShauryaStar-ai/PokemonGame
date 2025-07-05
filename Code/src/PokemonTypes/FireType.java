package PokemonTypes;


import Interfaces.PokemonForPlayer;

public class FireType implements PokemonForPlayer {
    private String type = "Fire";
    @Override
    public String attack() {
        String attack = "Flamethrower attack !! is happeing ";
        return attack;
    }

    public String getType() {
        return type;
    }
}
