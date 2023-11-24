package Utilites;

import Persons.*;

import static java.lang.Thread.sleep;

public class Delay {
    public static void delayP(AlivePerson p) {
        try {
            sleep(1000 / p.getSpeed().getValue());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void delay() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
