package itmo.java.mrpandaline.lab2.mypokemons.honedge.doublade.aegislash;

import itmo.java.mrpandaline.lab2.mypokemons.honedge.doublade.Doublade;
import itmo.java.mrpandaline.lab2.mypokemons.honedge.moves.ShadowClaw;

public class AegislashBlade extends Doublade{
    public AegislashBlade(String name, int level){
        super(name, level);
        setStats(60, 150, 50, 150, 50, 60);

        addMove(new ShadowClaw());
    }
}
