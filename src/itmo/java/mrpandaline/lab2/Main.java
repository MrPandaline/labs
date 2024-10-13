//TODO: Доделать move Rest

package itmo.java.mrpandaline.lab2;

import itmo.java.mrpandaline.lab2.mypokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
        Heatran p1 = new Heatran("Артём", 1);
        Hippopotas p2 = new Hippopotas("Белла", 1);
        Hippowdon p3 = new Hippowdon("Виктор", 1);
        Honedge p4 = new Honedge("Гермиона", 1);
        Doublade p5 = new Doublade("Денис", 1);
        AegislashBlade p6 = new AegislashBlade("Евдокия", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}
