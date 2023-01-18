//package Exam.Bilet26;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ArrayListOnList<T> {
//    private List<T> list;
//
//    public ArrayListOnList() {
//        this.list = new ArrayList<>();
//    }
//
//    public boolean isEmpty() {
//        return list.isEmpty();
//    }
//
//    public int size() {
//        return list.size();
//    }
//
//    public void add(T a) {
//        list.add(a);
//    }
//
//    public void add(int i, T a) {
//        list.add(i, a);
//    }
//
//    public T pop() {
//        return list.remove(list.size() - 1);
//    }
//
//    public static void main(String[] args) {
//        ArrayListOnList<Integer> array = new ArrayListOnList<>();
//        array.add(1);
//        array.add(2);
//        array.add(3);
//        array.add(4);
//        array.add(5);
//        for (int i = 0; i < array.size(); i++) {
//            System.out.print( + ", ");
//        }
//    }
//}
