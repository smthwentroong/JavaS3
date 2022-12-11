package Meth2.Pr3.task1;

import java.util.ArrayList;
import java.util.Random;

public class point1 {
    public static void main(String[] args) {
    ArrayList<Double> Method1 = new ArrayList<>();
    ArrayList <Double> Method2 = new ArrayList<>();
    Random rand = new Random();
    for(int i = 0; i < 10 ; i ++){
        Method1.add(Math.random()*1000);
        Method2.add(rand.nextDouble(1000));
    }
        System.out.println("First " + Method1.toString());
        System.out.println("Second " + Method2.toString());
        Method1.sort(Double::compareTo);
        Method2.sort(Double::compareTo);
        System.out.println("First " + Method1.toString());
        System.out.println("Second " + Method2.toString());
    }
}
