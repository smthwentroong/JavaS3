package Meth2.Pr20.point1_3;

import java.io.Serializable;

public class GenericClass<T extends Comparable, V extends Serializable, K extends Animal> {
    private T TObj;
    private V VObj;
    private K KObj;

    public GenericClass(T tObj, V vObj, K kObj) {
        TObj = tObj;
        VObj = vObj;
        KObj = kObj;
    }

    public T getTObj() {
        return TObj;
    }

    public void setTObj(T TObj) {
        this.TObj = TObj;
    }

    public V getVObj() {
        return VObj;
    }

    public void setVObj(V VObj) {
        this.VObj = VObj;
    }

    public K getKObj() {
        return KObj;
    }

    public void setKObj(K KObj) {
        this.KObj = KObj;
    }

    public String showUsedClasses() {
        return "GenericClass{" +
                "TObj=" + TObj.getClass() +
                ", VObj=" + VObj.getClass() +
                ", KObj=" + KObj.getClass() +
                '}';
    }
}
