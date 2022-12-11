package Meth2.Pr14.point1_6;

import java.util.Scanner;


public class TestClass {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String strForSplit = scn.nextLine();
        String[] splitedString = strForSplit.split("\\s+");
        System.out.println("Задание 1");
        for (String word : splitedString) System.out.println(word);

        System.out.println("Задание 2");
        String str1 = "abcdefghijklmnopqrstuv18340";
        String str2 = "abcdefghijklmnoasdfasdpqrstuv18340";
        System.out.println("Строка 1: " + str1.matches("abcdefghijklmnopqrstuv18340"));
        System.out.println("Строка 2: " + str2.matches("abcdefghijklmnopqrstuv18340"));

        System.out.println("Задание 3");
        str1 = "25.98 USD";
        str2 = "44 ERR";
        System.out.println(str1.matches("^[0-9]{1,}.[0-9]{1,2}\\s(USD|RUB|EU)"));
        System.out.println(str2.matches("^[0-9]{1,}.[0-9]{1,2}\\s(USD|RUB|EU)"));

        System.out.println("Задание 4");
        str1 = "(1 + 8) – 9 / 4";
        str2 = "6 / 5 – 2 * 9";
        System.out.println("Строка 1 " + str1.matches(".*(\\+)\\s*[0-9]{1,}.*"));
        System.out.println("Строка 2 " + str2.matches(".*(\\+)\\s*[0-9]{1,}.*"));

        System.out.println("Задание 5");
        str1 = "30/09/2003";
        str2 = "30-09-2003";
        System.out.println(str1.matches("(0[1-9]|[12][0-9]|3[01])[/](0[13578]|1[02])[/](([0-9]{2})[0-9]{2})|0[1-9]|[12][0-9]|30[/](0[469]|11)[/](([0-9]{2})[0-9]{2})|(0[1-9]|1[0-9]|2[0-8])[/](02)[/](([0-9]{2})[0-9]{2})|29[/](02)[/]((([0-9]{2})(04|08|[2468][048]|[13579][26]))|2000|1000)"));
        System.out.println(str2.matches("(0[1-9]|[12][0-9]|3[01])[/](0[13578]|1[02])[/](([0-9]{2})[0-9]{2})|0[1-9]|[12][0-9]|30[/](0[469]|11)[/](([0-9]{2})[0-9]{2})|(0[1-9]|1[0-9]|2[0-8])[/](02)[/](([0-9]{2})[0-9]{2})|29[/](02)[/]((([0-9]{2})(04|08|[2468][048]|[13579][26]))|2000|1000)"));

        System.out.println("Задание 6");
        str1 = "root@localhost";
        str2 = "@my.ru";
        System.out.println(str1.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)(()|(\\.([a-zA-Z]{2,5})))$"));
        System.out.println(str2.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)(()|(\\.([a-zA-Z]{2,5})))$"));
    }
}