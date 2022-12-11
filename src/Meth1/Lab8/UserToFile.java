package Meth1.Lab8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserToFile {
    public static void main(String[] args) {
        File file = new File("C://Users/hitro/Java2/src/Meth1/Lab8/testFile.txt");
        Scanner scn = new Scanner(System.in);
        scn.useDelimiter("\n");
        try {
            FileWriter writer = new FileWriter(file, true);
            String text;
            System.out.println("Введите строку: ");
            text = scn.nextLine();
            writer.write(text);
            writer.append("\n");
            writer.flush();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
