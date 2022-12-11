package Meth2.Pr6.point6_11.TempTranslate;

public class TempTranslate implements Convertable{

    @Override
    public double convert(String tempScale, double temp) {
        if (tempScale.equals("F")) return temp*1.8 + 32;
        else if (tempScale.equals("C")) return (temp - 32)/1.8;
        return 0;
    }
}
