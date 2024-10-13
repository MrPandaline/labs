package itmo.java.mrpandaline.lab2.mypokemons.hippopotas.moves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected String describe(){
        return "использует атаку Double Team";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect e = new Effect().stat(Stat.EVASION, +1);
        pokemon.addEffect(e);
    }
}
