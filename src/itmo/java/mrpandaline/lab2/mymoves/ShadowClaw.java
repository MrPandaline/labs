package itmo.java.mrpandaline.lab2.mymoves;

import ru.ifmo.se.pokemon.*;

public class ShadowClaw extends PhysicalMove {
    public ShadowClaw(){
        super(Type.GHOST, 70, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon p1, Pokemon p2){
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect eff = new Effect().turns(1).stat(Stat.SPEED, +1);
        pokemon.addEffect(eff);
    }

    @Override
    protected String describe(){
        return "использует Shadow Claw";
    }
}
