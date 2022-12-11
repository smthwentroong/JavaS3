package Meth2.Pr6.point6_11.CompShop;

import java.util.ArrayList;

public class Shop {
    ArrayList<Computer> computers;
    public Shop(int goods_am) {
        computers = new ArrayList<>(goods_am);
        for (int i = 0; i < goods_am; i++) {
            if (i%3 == 0) computers.add(new Computer(ComputerMarks.Cheap,
                    new Monitor("AOC 18.5", 1366, 768),
                    new Processor("AMD Athlon", 2000,2),
                    new Memory("Goodram", 1333, 2), 20000));
            else if (i%3 == 1) computers.add(new Computer(ComputerMarks.NotCheap,
                    new Monitor("LG 27", 1920, 1080),
                    new Processor("AMD Ryzen 5 4600", 3700,6),
                    new Memory("Corsair Vengeance LPX", 3200, 16), 70000));
            else computers.add(new Computer(ComputerMarks.Expensive,
                    new Monitor("Samsung Odyssey G9", 5120, 1440),
                    new Processor("AMD Ryzen 9 5900x", 3700,12),
                    new Memory("G.Skill Trident Z5 RGB", 6000, 64), 300000));
        }
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }
    public void removeComputer(int index) {
        computers.remove(index);
    }

    public Computer searchComputer(String mark) {
        for (int i = 0; i < computers.size(); i++) {
            if (mark.equals(computers.get(i).mark().getName()) &&
                    computers.get(i).mark() == ComputerMarks.Expensive)
                return computers.get(i);
            else if (mark.equals(computers.get(i).mark().getName()) &&
                    computers.get(i).mark() == ComputerMarks.NotCheap)
                return computers.get(i);
            else if (mark.equals(computers.get(i).mark().getName()) &&
                    computers.get(i).mark() == ComputerMarks.Cheap)
                return computers.get(i);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "computers=" + computers.toString() +
                '}';
    }
}
