package Meth2.Pr7.point5_6;

public class ProcessStrings implements WorkWithStrings{
    
    @Override
    public int getLength(String string) {
        return string.length();
    }

    @Override
    public String unevenChars(String string) {
        String res = "";
        for (int i = 0; i < string.length(); i++) {
            if (i%2 != 0) res += string.charAt(i);
        }
        return res;
    }

    @Override
    public String reverseString(String string) {
        String res = "";
        for (int i = string.length()-1; i >= 0; i--) {
            res += string.charAt(i);
        }
        return res;
    }
}
