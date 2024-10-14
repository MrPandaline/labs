package itmo.java.mrpandaline.lab2.mypokemons;

import itmo.java.mrpandaline.lab2.mymoves.ShadowClaw;
import itmo.java.mrpandaline.lab2.mymoves.ShadowSneak;
import ru.ifmo.se.pokemon.Type;

public class Honedge extends MyPokemon {
    public Honedge(String name, int level){
        super(name, level, 65);
        setStats(45, 80, 100, 35, 37, 28);
        setType(Type.STEEL, Type.GHOST);

        setMove(new ShadowClaw());
        addMove(new ShadowSneak());
    }

    protected Honedge(String name, int level, int minLevel){
        super(name, level, minLevel);
        setType(Type.STEEL, Type.GHOST);

        setMove(new ShadowClaw());
        addMove(new ShadowSneak());
    }
}
