package Meth2.Pr3.task3;

public class Convertor {

    public static double convert(double value,String currency, String resCurrency) {
        double k = 0;
        switch (resCurrency) {
            case "доллар":
                k = 1;
                break;
            case "рубль":
                k = 0.017;
                break;
            case "фунт":
                k = 1.21;
                break;
            case "евро":
                k = 1.04;
                break;
            case "йена":
                k = 0.00724;
                break;
        }
        switch (currency) {
            case "bax." :
                return value*k;
            case "rub.":
                return 60.39*value*k;
            case "pnd.":
                return 0.82*value*k;
            case "eur.":
                return 0.96*value*k;
            case "ien.":
                return 138.13*value*k;
        }
        return 0;
    }
}
