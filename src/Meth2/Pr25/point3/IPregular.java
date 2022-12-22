package Meth2.Pr25.point3;

import java.util.regex.Pattern;

public class IPregular {
    public static void main( String[] args){
        System.out.println((checkIP("127.0.0.1")? "Верно" : "Неверно"));
        System.out.println((checkIP("255.255.255.0")? "Верно" : "Неверно"));
        System.out.println((checkIP("1300.6.7.8")? "Верно" : "Неверно"));
        System.out.println((checkIP("abc.def.gha.bcd")? "Верно" : "Неверно"));
    }

    public static Boolean checkIP(String IP){
        var regex = "^(((1?[0-9]?[0-9])|(2[0-4][0-9])|(25[0-5]))\\.){3}(((1?[0-9]?[0-9])|(2[0-4][0-9])|(25[0-5])))$";
        return (Pattern.matches(regex, IP));
    }
}
