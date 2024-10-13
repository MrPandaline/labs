package itmo.java.mrpandaline.lab2.mypokemons.hippopotas.hippowdon;

import itmo.java.mrpandaline.lab2.mypokemons.hippopotas.Hippopotas;
import itmo.java.mrpandaline.lab2.mypokemons.hippopotas.hippowdon.moves.ThunderFang;

public class Hippowdon extends Hippopotas {
    public Hippowdon(String name, int level){
        super(name, level);
        if (level < 34){
            System.out.println("Фатальная ошибка! Он может быть 34 уровня минимум, я исправлю вашу оплошность");
            level = 34;
            super.setLevel(level);
        }
        super.setStats(108, 112, 118, 68, 72, 47);
        super.addMove(new ThunderFang());
    }

}
