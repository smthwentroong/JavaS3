package Meth2.Pr11.point5;

import java.util.ArrayList;
import java.util.LinkedList;

public class StructCompare {
    public static void main(String[] args) {


        ArrayList<Integer> arList = new ArrayList<>();
        LinkedList<Integer> lkList = new LinkedList<>();
        for(int i = 0; i < 10000000; i++){
            arList.add(i);
            lkList.add(i);
        }

        long start = System.currentTimeMillis();
        arList.add(883767);
        long end = System.currentTimeMillis() - start;
        System.out.println("ArrayList вставка: " + end);

        start = System.currentTimeMillis();
        arList.remove(345667);
        end = System.currentTimeMillis() - start;
        System.out.println("ArrayList удаление: " + end);

        start = System.currentTimeMillis();
        arList.indexOf(4546767);
        end = System.currentTimeMillis() - start;
        System.out.println("ArrayList поиск: " + end);

        start = System.currentTimeMillis();
        arList.add(4646,2346467);
        end = System.currentTimeMillis() - start;
        System.out.println("ArrayList добавление по образцу: " + end);


        start = System.currentTimeMillis();
        lkList.add(1345467);
        end = System.currentTimeMillis() - start;
        System.out.println("LinkedList вставка: " + end);

        start = System.currentTimeMillis();
        lkList.remove(985667);
        end = System.currentTimeMillis() - start;
        System.out.println("LinkedList удаление: " + end);

        start = System.currentTimeMillis();
        lkList.add(1936,35116);
        end = System.currentTimeMillis() - start;
        System.out.println("LinkedList добавление по образцу: " + end);

        start = System.currentTimeMillis();
        lkList.indexOf(3466);
        end = System.currentTimeMillis() - start;
        System.out.println("LinkedList поиск: " + end);

    }
}