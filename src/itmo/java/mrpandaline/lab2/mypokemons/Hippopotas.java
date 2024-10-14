package itmo.java.mrpandaline.lab2.mypokemons;

import itmo.java.mrpandaline.lab2.mymoves.Bite;
import itmo.java.mrpandaline.lab2.mymoves.DoubleTeam;
import itmo.java.mrpandaline.lab2.mymoves.Rest;
import ru.ifmo.se.pokemon.Type;

public class Hippopotas extends MyPokemon {
    public Hippopotas(String name, int level){
        super(name, level, 44);
        setStats(68, 72, 78, 38, 42, 32);
        setType(Type.GROUND);

        setMove(new Bite());
        addMove(new DoubleTeam());
        addMove(new Rest());
    }
    /*public Hippopotas(String name, int level, int minLevel){
        super(name, level, minLevel);
        setType(Type.GROUND);

        setMove(new Bite());
        addMove(new DoubleTeam());
        addMove(new Rest());
    }*/
}
