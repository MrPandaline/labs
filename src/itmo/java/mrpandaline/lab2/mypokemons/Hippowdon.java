package itmo.java.mrpandaline.lab2.mypokemons;

import itmo.java.mrpandaline.lab2.mymoves.ThunderFang;

public class Hippowdon extends Hippopotas {
    public Hippowdon(String name, int level){
        super(name, level);

        setStats(108, 112, 118, 68, 72, 47);
        addMove(new ThunderFang());
    }

}
