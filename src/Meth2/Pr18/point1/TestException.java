package Meth2.Pr18.point1;

public class TestException {
    public static void main(String[] args) {
        try{
            System.out.println( 1/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Деление на ноль");
        }
    }
}
