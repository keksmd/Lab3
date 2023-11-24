package Enums;

public enum Sounds {
    SKRIP(" *СКРИП-СКРИП* "),
    SHELK(" *ЩЕЛК* ");

    private Sounds(String sound) {
        this.sound = sound;
    }
    private String sound;
    public String getSound(){
        return this.sound;
    }


}
