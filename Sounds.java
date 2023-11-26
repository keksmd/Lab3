package Enums;

public enum Sounds {
    SKRIP(" *СКРИП-СКРИП* "),
    SHELK(" *ЩЕЛК* "),
    SHURSH(" *ШРХХХ* ");

    private Sounds(String sound) {
        this.sound = sound;
    }
    private String sound;
    public String getSound(){
        return this.sound;
    }


}
