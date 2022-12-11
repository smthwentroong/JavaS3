package Meth1.Task6;

public class Student implements Comparable <Student>{

    private static int amount = 1;
    private int iDNumber;
    private int score;

    public Student(int score){
        this.iDNumber = amount++;
        this.score = score;
    }


    @Override
    public int compareTo(Student second){
        return this.score - second.score;
    }

    @Override
    public String toString(){
        return "<Student " + iDNumber + ": " + this.score + ">";
    }

}
