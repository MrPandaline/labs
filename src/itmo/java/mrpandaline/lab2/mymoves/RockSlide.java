package itmo.java.mrpandaline.lab2.mymoves;
import itmo.java.mrpandaline.lab2.MyUtils;
import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {

    boolean flag = false;
    public RockSlide(){
        super(Type.ROCK, 75, 90);
    }

    @Override
    protected String describe(){
        return "использует Bite" + (this.flag ? " с дополнительным эффектом: заставляет оппонента ощутить страх" : "");
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        if (MyUtils.chance(0.3)) {
            this.flag = true;
            Effect.flinch(pokemon);
        }

    }

}
