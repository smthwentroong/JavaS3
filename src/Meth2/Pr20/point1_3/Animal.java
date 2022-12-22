package Meth2.Pr20.point1_3;

public class Animal {
    private String type;
    private Integer age;


    public Animal(String type, Integer age) {
        this.type = type;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
