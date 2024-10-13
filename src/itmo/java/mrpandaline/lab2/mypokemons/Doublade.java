package itmo.java.mrpandaline.lab2.mypokemons;

import itmo.java.mrpandaline.lab2.mymoves.Tackle;

public class Doublade extends Honedge {
    public Doublade(String name, int level){
        super(name, level, 65);
        setStats(59, 110, 150, 45, 49, 35);

        addMove(new Tackle());
    }
    protected Doublade(String name, int level, int minLevel){
        super(name, level, minLevel);
        addMove(new Tackle());
    }
}
