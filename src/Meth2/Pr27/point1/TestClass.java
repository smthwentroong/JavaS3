package Meth2.Pr27.point1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestClass {
    public static void main(String[] args)
    {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");

        Set<String> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);
    }
}
