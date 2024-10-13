package itmo.java.mrpandaline.lab2.mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ShadowSneak extends PhysicalMove {
    public ShadowSneak(){
        super(Type.GHOST, 40, 100,1, 1);
    }

    @Override
    protected boolean checkAccuracy(Pokemon p1, Pokemon p2){
        return true;
    }

    @Override
    protected String describe(){
        return "использует Shadow Sneak";
    }
}
