package Meth2.Pr24;

public class TextDocument extends Document{

    private String content;
    private int textLength;

    public TextDocument(){
        this.content = "";
        this.textLength = 0;
        this.size = 100;
        this.name = "Unset";
        this.dir = "Unset";
    }

    public TextDocument(String dir, String name, int size){
        this.content = "";
        this.textLength = 0;
        this.size = size;
        this.name = name;
        this.dir = dir;
    }

    public TextDocument(String stContent,String dir, String name, int size) {
        this.content = stContent;
        this.textLength = stContent.length();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String stContent) {
        this.content = stContent;
    }

    public int getTextLength() {
        return textLength;
    }

    public void setTextLength(int textLength) {
        this.textLength = textLength;
    }
}