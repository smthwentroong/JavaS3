package Meth2.Pr21.point4;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

public class CatValToArr {
    public static ArrayList<File> findFiles(String catPath) throws IOException {
        ArrayList<File> inner = new ArrayList<>();

        for (Path path : Files.walk(Paths.get(catPath)).filter(Files::isRegularFile).toList()) inner.add(new File(path.toUri()));

        return inner;
    }

    public static String readFile(File file) throws FileNotFoundException {
        InputStream inputStream = new FileInputStream(file);

        String stResult = "";

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                stResult += line;
                stResult += "\n";
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return stResult;

    }
    
    public static void main(String[] args) throws IOException {
        ArrayList<File> inner = findFiles("C:/Users/hitro/Java2/src/Meth2/Pr21/point4/Catalog");

        for(int i = 0; i < inner.size() && i < 5; i++){
            System.out.println("Содержимое файла: " + inner.get(i).getName() + "\n");
            System.out.println(readFile(inner.get(i)) + "\n");
        }
    }
}
