package itmo.java.mrpandaline.lab2.mypokemons.hippopotas.hippowdon.moves;

import itmo.java.mrpandaline.lab2.MyUtils;
import ru.ifmo.se.pokemon.*;

public class ThunderFang extends PhysicalMove {
    public ThunderFang(){
        super(Type.ELECTRIC, 65, 95);
    }
    @Override
    protected String describe(){
        return "использует Thunder Fang";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (MyUtils.chance(0.1)){
            Effect.flinch(pokemon);
        }
        if (MyUtils.chance(0.1)){
            Effect.paralyze(pokemon);
        }
    }
}
