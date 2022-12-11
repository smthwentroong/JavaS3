package Meth1.LeraHelp;

import java.util.Scanner;

public class Shop {
    static double cost;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=-1;
        while (true) {
            System.out.print("1.iPhone 14 Pro Max 1Тб - 184 990 ₽\n2.iPhone 14 Pro 1Тб - 171 990 ₽\n" +
                    "3.iPhone 13 Pro Max 1Тб - 169 990 ₽\n4.iPhone 14 Pro Max 512Гб - 164 990 ₽\n" +
                    "5.iPhone 14 Pro 512Гб - 154 990 ₽\n0.Выход\n" +
                    "Выберите товар, который желаете приобрести:");
            i = input.nextInt();
            switch (i) {
                case 1:
                    cost = 184990;
                    break;
                case 2:
                    cost = 171990;
                    break;
                case 3:
                    cost = 169990;
                    break;
                case 4:
                    cost = 164990;
                    break;
                case 5:
                    cost = 154990;
                    break;
            }

            i = -1;
            String currency = "";
            System.out.print("1.Российский рубль\n2.Доллар США\n" +
                    "3.Евро\n14.Японская иена\n5.Фунт стерлингов\nВыберите валюту: ");
            i = input.nextInt();
            switch (i) {
                case 1:
                    currency = "Рублей";
                    break;
                case 2:
                    cost = Convertor.dollar(cost);
                    currency = "Долларов";
                    break;
                case 3:
                    cost = Convertor.euro(cost);
                    currency = "Евро";
                    break;
                case 4:
                    cost = Convertor.iena(cost);
                    currency = "Йен";
                    break;
                case 5:
                    cost = Convertor.pound(cost);
                    currency = "Фунтов Стерлингов";
                    break;
            }
            System.out.printf("Стоимость: %s %s", cost, currency);
        }
    }
}


class Convertor{
    static double rate;
    static double dollar(double cost){
        rate = 61.53;
        return cost/rate;
    }
    static double euro(double cost){
        rate = 61.53;
        return cost/rate;
    }
    static double iena(double cost){
        rate = 61.53;
        return cost/rate;
    }
    static double pound(double cost){
        rate = 61.53;
        return cost/rate;
    }
}