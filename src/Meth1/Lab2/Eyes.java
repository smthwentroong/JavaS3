package Meth1.Lab2;

import java.util.Scanner;

public class Eyes {
    String typeObjectInVision;
    String typeSurfaceInVision;
    Scanner scn = new Scanner(System.in);

    public void setTypeObjectInVision(String typeObjectInVision) {
        this.typeObjectInVision = typeObjectInVision;
    }

    public void setTypeSurfaceInVision(String typeSurfaceInVision) {
        this.typeSurfaceInVision = typeSurfaceInVision;
    }

    public String getTypeObjectInVision() {
        return typeObjectInVision;
    }

    public String getTypeSurfaceInVision() {
        return typeSurfaceInVision;
    }

    public void see() {
        System.out.println("Если есть предмет, который можно взять, введите 1, иначе 0");
        if (scn.nextInt() == 1) {
            setTypeObjectInVision("takeable");
        }
        else setTypeObjectInVision("untakeable");
        System.out.println("Если на поверхность опасно наступать, введите 1, иначе 0");
        if (scn.nextInt() == 1) {
            setTypeSurfaceInVision("danger");
        }
        else setTypeSurfaceInVision("safe");
    }
}
