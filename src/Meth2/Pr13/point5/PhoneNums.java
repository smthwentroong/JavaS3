package Meth2.Pr13.point5;

public class PhoneNums {
    static class PhoneNumber {
        String countryCode = "";
        String operator = "";
        String someThreeNums = "";
        String someLastFourNums = "";

        PhoneNumber(String str){
            if (str.charAt(0) == '+'){
                countryCode += "+";
            }
            int currDigit = 0;
            countryCode += str.substring(1, str.length() - 10);
            currDigit = countryCode.length();
            operator += str.substring(currDigit,currDigit + 3);
            currDigit += operator.length() ;
            someThreeNums += str.substring(currDigit,currDigit + 3);
            currDigit += someThreeNums.length() ;
            someLastFourNums += str.substring(currDigit,currDigit + 4);
        }

        @Override
        public String toString(){
            return countryCode + " " + operator + " " + someThreeNums + " " + someLastFourNums;
        }
    }

    public static void main(String[] args) {
        PhoneNumber tmp = new PhoneNumber("+104289652211");
        System.out.println(tmp);
    }
}
