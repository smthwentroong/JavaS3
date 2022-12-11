package Meth2.Pr18.point6;

public class TestException {
    public static void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        }
        catch (Exception e){
            System.out.println("Пустое сообщение");
        }
    }
    public static String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( " null key in getDetails"  );
        }
        return "data for" + key;
    }

    public static void main(String[] args) {
        printMessage(null);
    }

}