package Enums;

public enum Speed {
    SLOW(1),
    NORMAL(2),
    FAST(3);

    Speed(int i) {
        this.value = i;
    }
    private int value;

    public int getValue() {
        return value;
    }
}
