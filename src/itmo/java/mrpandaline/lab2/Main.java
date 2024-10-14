package itmo.java.mrpandaline.lab2;

import itmo.java.mrpandaline.lab2.mypokemons.*;
import ru.ifmo.se.pokemon.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String name1 = "Артём";
        String name2 = "Белла";
        String name3 = "Виктор";
        String name4 = "Гермиона";
        String name5 = "Денис";
        String name6 = "Евдокия";

        int lvl1 = 91;
        int lvl2 = 44;
        int lvl3 = 44;
        int lvl4 = 65;
        int lvl5 = 65;
        int lvl6 = 65;

        Battle b = new Battle();
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Вы хотите использовать шаблон (1/0): ");
            int flag = Integer.parseInt(in.nextLine());

            if (flag == 0) {

                System.out.print("Введите имя Heatran'а: ");
                name1 = in.nextLine();

                System.out.printf("Введите уровень Heatran'а по имени " + name1 + " : ");
                lvl1 = Integer.parseInt(in.nextLine());

                System.out.print("Введите имя Hippopotas'а: ");
                name2 = in.nextLine();
                System.out.printf("Введите уровень Hippopotas'а по имени " + name2 + " : ");
                lvl2 = Integer.parseInt(in.nextLine());

                System.out.print("Введите имя Hippowdon'а: ");
                name3 = in.nextLine();
                System.out.printf("Введите уровень Hippowdon'а по имени " + name3 + " : ");
                lvl3 = Integer.parseInt(in.nextLine());

                System.out.print("Введите имя Honedg'а: ");
                name4 = in.nextLine();
                System.out.printf("Введите уровень Honedg'а по имени " + name4 + " : ");
                lvl4 = Integer.parseInt(in.nextLine());

                System.out.print("Введите имя Doublad'а: ");
                name5 = in.nextLine();
                System.out.printf("Введите уровень Doublad'а по имени " + name5 + " : ");
                lvl5 = Integer.parseInt(in.nextLine());

                System.out.print("Введите имя Aegislash Blad'а: ");
                name6 = in.nextLine();
                System.out.printf("Введите уровень Aegislash Blad'а по имени " + name6 + " : ");
                lvl6 = Integer.parseInt(in.nextLine());
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Ошибка: введено не число. Я использую шаблон");
        }

        Heatran p1 = new Heatran(name1, lvl1);
        Hippopotas p2 = new Hippopotas(name2, lvl2);
        Hippowdon p3 = new Hippowdon(name3, lvl3);
        Honedge p4 = new Honedge(name4, lvl4);
        Doublade p5 = new Doublade(name5, lvl5);
        AegislashBlade p6 = new AegislashBlade(name6, lvl6);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}
