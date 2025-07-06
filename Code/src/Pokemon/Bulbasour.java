package Pokemon;

import PokemonTypes.GrassType;

public class Bulbasour extends GrassType {
    public Bulbasour(){

    }
    public int getLevel() {
        return level;
    }

    public int setLevel(int level) {
        if (level < 0){
            System.out.println( "Ivalid level");
        }
        else
            this.level = level;
        return level;
    }

    @Override
    public String attack() {
        return "Bulbasaur: "+ super.attack();
    }
    public String leafAttack(){
        return "Leaf Attack is happeing";
    }

    @Override
    public String toString() {
        return "Bulbasour named "+this.name;
    }
}
