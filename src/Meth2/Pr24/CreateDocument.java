package Meth2.Pr24;

public interface CreateDocument {
    public Document CreateNew(String dir, String name, int size);
    public Document CreateOpen(String name);
}
