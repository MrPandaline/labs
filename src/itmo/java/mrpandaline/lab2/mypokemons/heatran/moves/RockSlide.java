package itmo.java.mrpandaline.lab2.mypokemons.heatran.moves;
import itmo.java.mrpandaline.lab2.MyUtils;
import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
    public RockSlide(){
        super(Type.ROCK, 75, 90);
    }

    @Override
    protected String describe(){
        return "использует атаку Rock Slide";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        if (MyUtils.chance(0.3)) {
            Effect.flinch(pokemon);
        }

    }

}
