package itmo.java.mrpandaline.lab2.mymoves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon p1, Pokemon p2){
        return true;
    }

    @Override
    protected String describe(){
        return "использует Double Team";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.EVASION, +2);
    }
}
