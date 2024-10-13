//TODO: Разобраться с выводом сообщений
//TODO: Разобраться с длительностью вызова эффектов меняющих статы
//TODO: Переопределять метод checkAccuracy для атак со 100% точностью ( и для статус атак без точности)
//TODO: Переписать изменение статов не через Effect, а через pokemon.setMod
//TODO: Доделать move Rest
//TODO: Посмотреть Thunder Fang
//TODO: Добавить вывод применения эффектов через flag и метод describe
//TODO: Переписать во всех классах вызов всего без super
//TODO: Добавить проверку уровня покемона относительно его атак
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
