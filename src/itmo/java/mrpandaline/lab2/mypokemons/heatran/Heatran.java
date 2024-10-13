package itmo.java.mrpandaline.lab2.mypokemons.heatran;

import itmo.java.mrpandaline.lab2.mypokemons.heatran.moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Heatran extends Pokemon{
    public Heatran(String name, int level){
        super(name, level);
        super.setStats(91, 90, 106, 130, 106, 77);
        super.setType(Type.FIRE, Type.STEEL);
        super.addMove(new RockSlide());
        super.addMove(new Bulldoze());
        super.addMove(new FlashCannon());
        super.addMove(new RockTomb());
    }
}
