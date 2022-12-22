package Meth2.Pr25.point4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BracesReg {

    public static void main(String[] args) {
        System.out.println(checkBraces("(3*+*5)*–*9*×*4") ? "Верно" : "Неверно");
        System.out.println(checkBraces("((3*+*5)*–*9*×*4") ? "Верно" : "Неверно");
    }

    public static Boolean checkBraces(String exp){
        Pattern pattern = Pattern.compile("\\([^()]*\\)");
        Matcher matcher;
        while ((matcher = pattern.matcher(exp)).find())
            exp = matcher.replaceAll("");
        return !(exp.contains("(") || exp.contains((")")));
    }
}