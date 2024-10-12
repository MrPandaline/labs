//TODO: Разобраться с выводом сообщений

package itmo.java.mrpandaline.lab2;
import itmo.java.mrpandaline.lab2.mypokemons.heatran.Heatran;
import ru.ifmo.se.pokemon.*;
public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p1 = new Heatran("Чужой", 1);
        Pokemon p2 = new Pokemon("Хищник", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}
