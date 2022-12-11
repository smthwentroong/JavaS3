package Meth2.Pr13.point4;

public class Shirts {
    static class Shirt{
        String articul = "";
        String name = "";
        String color = "";
        String sizeMark = "";

        public Shirt(String str) {
            String[] goods = str.split(",");
            articul = goods[0];
            name = goods[1];
            color = goods[2];
            sizeMark = goods[3];
        }
        public String toString(){
            return "Article: " + articul + " Model: " + name + " Color: " + color + " Size: " + sizeMark;
        }
    }

    public static void main(String[] args) {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black TShirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt[] newFormatShirts = new Shirt[11];
        for(int i = 0; i < shirts.length ; i++){
            newFormatShirts[i] = new Shirt(shirts[i]);
            System.out.println(newFormatShirts[i]);
        }
    }
}