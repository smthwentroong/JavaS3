package Meth2.Pr24;

public abstract class Document {

    protected int size = 0;
    protected String name = "";
    protected String dir = "";

    public abstract String getContent();

    public abstract void setContent(String content);

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
}