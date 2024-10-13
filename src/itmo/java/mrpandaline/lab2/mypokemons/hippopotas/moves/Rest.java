package itmo.java.mrpandaline.lab2.mypokemons.hippopotas.moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon p1, Pokemon p2){
        return true;
    }

    @Override
    protected String describe(){
        return "использует Rest";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect e = new Effect().condition(Status.SLEEP).turns(2);
        pokemon.addEffect(e);
    }
}
