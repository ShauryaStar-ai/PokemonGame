    package PokemonTypes;


    import Abstraction.PokemonBase;


    public class FireType extends PokemonBase{

        public FireType(String name, int level){
            super( name,level,"fire");
        }
        @Override
        public String Generalattack(PokemonBase pokemonAttacked) {
            return getName() + " uses Flamethrower !";
        }
    }

