package Enums;

public enum ItemSeize {
    BIG(5),
    MEDIUM(3),
    SMALL(1);
    ItemSeize(int sz){
        this.seize = sz;
    }
    private int seize;

    public int getSeize() {
        return seize;
    }
}
