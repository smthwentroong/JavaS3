package Meth2.Pr22.point1;

import java.util.Scanner;
import java.util.Stack;

public class Calculator {
    public static double fromPolandToNormal(String polandExpression) throws EmptyStackException, DivisionByZeroException {
        Double result = 0d;

        String currentPosition = "";
        Stack<Double> currentStack = new Stack<>();
        for(int i = 0; i < polandExpression.length(); i++){
            if (checkOperand(((Character)polandExpression.charAt(i)).toString())){
                if (currentStack.size() < 2) throw new EmptyStackException();
                result = operationResult(currentStack.pop(), currentStack.pop(), ((Character)polandExpression.charAt(i)).toString());
                currentStack.push(result);
            }
            else if (polandExpression.charAt(i) == ' ' && !currentPosition.replace(" ", "").equals("") && !currentPosition.replace(" ", "").equals(".")){

                currentStack.push(Double.parseDouble(currentPosition.replace(" ", "")));
                currentPosition = "";
            }
            else{
                currentPosition += polandExpression.charAt(i);
            }
        }

        return (currentStack.empty())? 0 :currentStack.pop();
    }

    public static boolean checkOperand(String str){
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

    public static Double operationResult(Double first, Double second, String operand) throws DivisionByZeroException {
        if (operand.equals("/") && first == 0) throw new DivisionByZeroException();
        switch(operand){
            case "+" : return first + second;
            case "-" : return second - first;
            case "*" : return first * second;
            case "/" : return second / first;
        }
        return 0d;
    }

    public static void main(String[] args) throws EmptyStackException {
        Scanner scn = new Scanner(System.in);
        String poland;
        try {
            do {
                poland = scn.nextLine();
                System.out.println(fromPolandToNormal(poland));
            }
            while (poland != "EXIT");

        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}