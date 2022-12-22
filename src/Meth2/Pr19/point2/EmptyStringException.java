package Meth2.Pr19.point2;

public class EmptyStringException extends IllegalArgumentException{
    public EmptyStringException(){
        super("EmptyStringException: you can't input empty string");
    }
}