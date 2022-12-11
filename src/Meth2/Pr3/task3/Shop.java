package Meth2.Pr3.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        ArrayList<Good> goods = new ArrayList<>();
        goods.add(new Good(113499, "rub.", "MacBook Air M1"));
        goods.add(new Good(99999, "rub.", "HP Omen15"));
        goods.add(new Good(131949, "rub.", "Asus Rog-Strix"));
        goods.add(new Good(104499, "rub.", "Gigabyte Aorus k15"));
        goods.add(new Good(123499, "rub.", "MacBook Air M2"));
        System.out.println(goods);
        System.out.print("Выюерите номер товара: ");
        int num = scn.nextInt();
        scn = new Scanner(System.in);
        System.out.print("Введите валюту: ");
        String currency = scn.nextLine();
        System.out.printf("Стоимость товара %s составляет: %.3f %s\n", goods.get(num).name,Convertor.convert((double)(goods.get(num-1)).value, goods.get(num-1).currency, currency),currency);

        ArrayList<Employee> employeers = new ArrayList<>();
        employeers.add(new Employee("Никита", 999999));
        employeers.add(new Employee("Владислав", 77145));
        employeers.add(new Employee("Антон", 91251));
        employeers.add(new Employee("Генадий", 154165));
        employeers.add(new Employee("Артем", 54356));
        Report.generateReport(employeers);
    }
}
