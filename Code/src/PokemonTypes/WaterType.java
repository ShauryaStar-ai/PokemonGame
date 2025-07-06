package PokemonTypes;

import Abstraction.PokemonForPlayer;

public class WaterType implements PokemonForPlayer {
    private String type = "Water";
    @Override
    public String attack() {
        String attack = "Hydro Pump attack !! is happeing ";
        return attack;
        }
    public String getType() {
        return type;
    }
}
