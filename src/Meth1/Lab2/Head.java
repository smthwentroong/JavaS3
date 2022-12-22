package Meth1.Lab2;

import java.util.Scanner;

public class Head {
    Eyes Vision = new Eyes();
    Hand LeftH = new Hand("left");
    Hand RightH = new Hand("right");
    Leg LeftL = new Leg("left");
    Leg RightL = new Leg("right");
    String typeObjectInVision;
    String typeSurfaceInVision;
    boolean located;
    int commands;
    Scanner scn = new Scanner(System.in);

    public Head() {
        located = false;
        action();
    }

    public String action() {
        System.out.println("Введите команду для исполнения");
        System.out.println("1 - оглядеться, 2 - шагнуть, 3 - взять, 4 - кинуть");
        int commands = scn.nextInt();
        if (commands == 1) {
            Vision.see();
            this.typeObjectInVision = Vision.getTypeObjectInVision();
            this.typeSurfaceInVision = Vision.getTypeSurfaceInVision();
            located = true;
            return "Осмотрелись";
        }
        else if (commands == 2 && located) {
            if (!LeftL.getStepped()) {
                String res = LeftL.step(typeSurfaceInVision);
                if (LeftL.getStepped()) {
                    RightL.setStepped(false);
                    located = false;
                }
                return res;
            }
            else if (!RightL.getStepped()) {
                String res = RightL.step(typeSurfaceInVision);
                if (RightL.getStepped()) {
                    LeftL.setStepped(false);
                    located = false;
                }
                return res;
            }
        }
        else if(commands == 3 && located) {
            if (!LeftH.getBusy()) {
                String res = LeftH.holdUp(typeObjectInVision);
                if (LeftH.getBusy()) {
                    located = false;
                    return res;
                }
            }
            else if (!RightH.getBusy()){
                String res = RightH.holdUp(typeObjectInVision);
                if (RightH.getBusy()) {
                    located = false;
                    return res;
                }
            }
        }
        else if (commands == 4) {
            System.out.println("Выберите руку: 1 - левая, 2 - правая");
            int arm = scn.nextInt();
            if (arm == 1) {
                return LeftH.throwUp();
            }
            else if (arm == 2) {
                return RightH.throwUp();
            }

        }

        return "Некорректная команда";
    }
}
