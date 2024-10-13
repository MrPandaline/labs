package itmo.java.mrpandaline.lab2.mypokemons;

import itmo.java.mrpandaline.lab2.mymoves.ShadowClaw;

public class AegislashBlade extends Doublade{
    public AegislashBlade(String name, int level){
        super(name, level, 65);
        setStats(60, 150, 50, 150, 50, 60);
        addMove(new ShadowClaw());
    }
}
