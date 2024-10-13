package itmo.java.mrpandaline.lab2.mypokemons.honedge.doublade;

import itmo.java.mrpandaline.lab2.mypokemons.honedge.Honedge;
import itmo.java.mrpandaline.lab2.mypokemons.honedge.doublade.moves.Tackle;

public class Doublade extends Honedge {
    public Doublade(String name, int level){
        super(name, level);
        setStats(59, 110, 150, 45, 49, 35);

        addMove(new Tackle());
    }
}
