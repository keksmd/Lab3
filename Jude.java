package Persons;

import Enums.Sex;

public class Jude extends AlivePerson {
    public Jude(String n, Sex s) {
        super(n,s);
    }

    public void run(){
        System.out.println(this.toString() + "бежит");
    }
}
