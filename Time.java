package Enums;

public enum Time {
    MORNING("Утро"),
    DAY("День"),
    EVENING("Вечер"),
    NIGHT("Ночь");
     private String value;
    Time(String v){
        this.value = v;

    }
    public String getValue() {
        return value;
    }
}
