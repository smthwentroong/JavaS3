package Lera.Task3;

import java.util.Scanner;

public class TestClass {
    public static void favSeason(Seasons season) {
        switch(season.name()) {
            case "Лето":
                System.out.println("Я люблю лето");
                break;
            case "Весна":
                System.out.println("Я люблю весну");
                break;
            case "Зима":
                System.out.println("Я люблю зиму");
                break;
            case "Осень":
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите ваше любимое время года:" +
                "\nЗима, Весна, Лето, Осень");
        String name = scn.nextLine();
        Seasons Season = Seasons.valueOf(name);
        System.out.println(Season.toString());
    }
}
