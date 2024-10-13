package itmo.java.mrpandaline.lab2.mypokemons;

import ru.ifmo.se.pokemon.Pokemon;

public class MyPokemon extends Pokemon {

    public MyPokemon(String name, int level, int minLevel){
        super(name, level);

        if (level < minLevel){
            System.out.printf("Фатальная ошибка! " + this + " должен быть %d уровня минимум\n", minLevel);
            setLevel(minLevel);

        }
        if (level > 100){
            System.out.println("Фатальная ошибка! " + this + " покемон не может быть более чем 100 уровня");
            setLevel(100);
        }
    }

    /*public MyPokemon(String name, int level){
        super(name, level);
        if (level > 100){
            System.out.println("Фатальная ошибка! " + this + " покемон не может быть более чем 100 уровня");
            setLevel(100);
        }
    }*/

}
