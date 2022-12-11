package Meth2.Pr11.point2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CompareDates {

    public static void main(String[] args) throws ParseException {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();

        Date inputDate = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").parse(input);

        Date programDate = new Date();

        if (inputDate.compareTo(programDate) == 0){
            System.out.println("Введенное время" + inputDate);
            System.out.println("Программное время" + programDate);
            System.out.println("Введенное время равно системному");
        }
        else if(inputDate.compareTo(programDate) == 1){
            System.out.println("Введенное время" + inputDate);
            System.out.println("Программное время" + programDate);
            System.out.println("Введенное время больше системного");
        }
        else{
            System.out.println("Введенное время" + inputDate);
            System.out.println("Программное время" + programDate);
            System.out.println("Введенное время меньше системного");
        }
    }

}