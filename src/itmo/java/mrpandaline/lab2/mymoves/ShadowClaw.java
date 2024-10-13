package itmo.java.mrpandaline.lab2.mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ShadowClaw extends PhysicalMove {
    public ShadowClaw(){
        super(Type.GHOST, 70, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon p1, Pokemon p2){
        return true;
    }
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        return (att.getStat(Stat.SPEED) / 512) + 1;
    }

    @Override
    protected String describe(){
        return "использует ShadowClaw";
    }
}
