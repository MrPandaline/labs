package itmo.java.mrpandaline.lab2.mymoves;

import itmo.java.mrpandaline.lab2.MyUtils;
import ru.ifmo.se.pokemon.*;

public class Bite extends PhysicalMove {

    boolean flag = false;

    public Bite(){
        super(Type.DARK, 60, 100);
    }

    @Override
    protected String describe(){
        return "использует Bite" + (this.flag ? " с дополнительным эффектом: заставляет оппонента ощутить страх" : "");
    }

    @Override
    protected boolean checkAccuracy(Pokemon p1, Pokemon p2){
        return true;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (MyUtils.chance(0.3)){
            this.flag = true;
            Effect.flinch(pokemon);
        }
    }
}
