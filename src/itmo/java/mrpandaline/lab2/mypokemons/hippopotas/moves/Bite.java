package itmo.java.mrpandaline.lab2.mypokemons.hippopotas.moves;

import itmo.java.mrpandaline.lab2.MyUtils;
import ru.ifmo.se.pokemon.*;

public class Bite extends PhysicalMove {
    public Bite(){
        super(Type.DARK, 60, 100);
    }

    @Override
    protected String describe(){
        return "использует Bite";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (MyUtils.chance(0.3)){
            Effect.flinch(pokemon);
        }
    }
}
