package itmo.java.mrpandaline.lab2.mymoves;

import ru.ifmo.se.pokemon.Effect;
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
        String message1 = "использует Flash Cannon c дополнительным эффектом: специальная защита снижена на 1";
        String message2 = "использует Flash Cannon";
        return this.flag ? message1 : message2;
    }

    @Override
    protected boolean checkAccuracy(Pokemon p1, Pokemon p2){
        return true;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1).turns(-1);
        pokemon.addEffect(e);
        if (e.success()){
            this.flag = true;
        }
    }
}
