package Meth2.Pr20.point1_3;

public class TestClass {
    public static void main(String[] args) {
        GenericClass<Integer,String,AnimalExpanded> AnimalGeneric = new GenericClass<>(5,"AnimalGeneric",new AnimalExpanded("Snake",30,"Kaaa"));
        System.out.println(AnimalGeneric.showUsedClasses());
    }
}
