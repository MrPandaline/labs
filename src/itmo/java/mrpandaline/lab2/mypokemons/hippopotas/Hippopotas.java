package itmo.java.mrpandaline.lab2.mypokemons.hippopotas;

import itmo.java.mrpandaline.lab2.mypokemons.hippopotas.moves.Bite;
import itmo.java.mrpandaline.lab2.mypokemons.hippopotas.moves.DoubleTeam;
import itmo.java.mrpandaline.lab2.mypokemons.hippopotas.moves.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Hippopotas extends Pokemon {
    public Hippopotas(String name, int level){
        super(name, level);
        super.setStats(68, 72, 78, 38, 42, 32);
        super.setType(Type.GROUND);

        super.addMove(new Bite());
        super.addMove(new DoubleTeam());
        super.addMove(new Rest());
    }
}
