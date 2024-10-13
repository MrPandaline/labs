package itmo.java.mrpandaline.lab2.mypokemons;

import itmo.java.mrpandaline.lab2.mymoves.Bulldoze;
import itmo.java.mrpandaline.lab2.mymoves.FlashCannon;
import itmo.java.mrpandaline.lab2.mymoves.RockSlide;
import itmo.java.mrpandaline.lab2.mymoves.RockTomb;
import ru.ifmo.se.pokemon.Type;

public class Heatran extends MyPokemon{
    public Heatran(String name, int level){
        super(name, level, 91);
        setStats(91, 90, 106, 130, 106, 77);
        setType(Type.FIRE, Type.STEEL);
        addMove(new RockSlide());
        addMove(new Bulldoze());
        addMove(new FlashCannon());
        addMove(new RockTomb());
    }
}
