package itmo.java.mrpandaline.lab2.mymoves;

import itmo.java.mrpandaline.lab2.MyUtils;
import ru.ifmo.se.pokemon.*;

public class ThunderFang extends PhysicalMove {

    boolean flag1 = false;
    boolean flag2 = false;

    public ThunderFang(){
        super(Type.ELECTRIC, 65, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (MyUtils.chance(0.1)){
            this.flag1 = true;
            Effect.flinch(pokemon);
        }
        if (MyUtils.chance(0.1)){
            this.flag2 = true;
            Effect.paralyze(pokemon);
        }
    }
    @Override
    protected String describe(){
        String message = "использует Thunder Fang";
        String part2 = " с дополнительным эффектом: заставляет оппонента ";
        String part31 = " ощутить страх";
        String part32 = " войти в состояние паралича";
        if (this.flag1 || this.flag2) {
            message += part2;
            if (this.flag1 && !this.flag2) {
                message += part31;
            }
            else if (this.flag2 && !this.flag1) {
                message += part32;
            }
            else message += part31 + " и " + part32;
        }

        return message;
    }
}
