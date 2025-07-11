    package PokemonTypes;


    import Abstraction.PokemonBase;


    public class FireType extends PokemonBase{

        public FireType(String name, int level){
            super( name,level,"fire");
        }
        @Override
        public String Generalattack(PokemonBase pokemonAttacked) {
            double damage = 30;
            pokemonAttacked.updateHealthAfterAttack(damage);
            return "Flamethrower attack !! CAUSED DAMAGE "+ damage;
        }

    }

