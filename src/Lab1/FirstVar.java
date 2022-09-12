package Lab1;

public class FirstVar {

    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i+1;
        }
        System.out.println("С помощью for");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        System.out.println("С помощью while");
        while (n > 0) {
            System.out.println(array[10 - n--]);
        }

        System.out.println("С помощью do while");
        do {
            System.out.println(array[n++]);
        } while (array.length > n);
    }

}
