package itmo.java.mrpandaline.lab2.mymoves;

import itmo.java.mrpandaline.lab2.MyUtils;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class FlashCannon extends SpecialMove {

    boolean flag = false;

    public FlashCannon(){
        super(Type.STEEL, 80, 100);
    }
    @Override
    protected String describe(){
        String message1 = " c дополнительным эффектом: специальная защита снижена на 1";
        return "использует Flash Cannon" + (this.flag ? message1 : "");
    }

    @Override
    protected boolean checkAccuracy(Pokemon p1, Pokemon p2){
        return true;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (MyUtils.chance(0.1)){
            this.flag = true;
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -2);
        }
    }
}
