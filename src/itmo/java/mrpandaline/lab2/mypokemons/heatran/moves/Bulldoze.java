package itmo.java.mrpandaline.lab2.mypokemons.heatran.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class Bulldoze extends PhysicalMove {
    public Bulldoze(){
        super(Type.GROUND, 60, 100);
    }

    @Override
    protected String describe(){
        return "использует атаку Bulldoze";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().stat(Stat.SPEED, -1);
        pokemon.addEffect(e);
    }
}
