package Meth2.Pr24;

import java.util.ArrayList;

public class CreateTextDocument implements CreateDocument{

    ArrayList<Document> files = new ArrayList<>();

    @Override
    public Document CreateNew(String dir, String name, int size) {
        Document doc = new TextDocument(dir,name,size);

        files.add(doc);
        return doc;
    }

    @Override
    public Document CreateOpen(String name) {
        return files.stream().filter(IDocument->name.equals(IDocument.getName())).findFirst().orElse(new TextDocument());
    }
}