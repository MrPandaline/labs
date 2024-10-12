package itmo.java.mrpandaline.lab2.mypokemons.hippopotas;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Hippopotas extends Pokemon {
    public Hippopotas(String name, int level){
        super(name, level);
        super.setStats(68, 72, 78, 38, 42, 32);
        super.setType(Type.GROUND);
    }
}
