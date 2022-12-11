package Meth2.Pr18.point4;

import java.util.Scanner;

public class TestException {

    public static void main(String[] args) {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Введите целое число: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch(NumberFormatException e){
            System.out.println("Не является целочисленным");
        } catch (Exception e){
            System.out.println("Общее исключение");
        }
        finally {
            System.out.println("Блок 'finally'");
        }
    }

}