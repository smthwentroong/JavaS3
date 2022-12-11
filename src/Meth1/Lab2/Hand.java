package Meth1.Lab2;

public class Hand {
    private String side;
    private boolean busy;

    public Hand(String side) {
        this.side = side;
        busy = false;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public boolean getBusy() {
        return busy;
    }

    public String holdUp(String objectType) {
        if (!busy && objectType == "takeable") {
            busy = true;
            return "Взяли предмет";
        }
        return "Невозможно взять";
    }

    public String throwUp() {
        if (busy) {
            busy = false;
            return "Бросили предмет";
        }
        return "В этой руке ничего нет";
    }

}
