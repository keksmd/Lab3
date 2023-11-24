package Persons;

import Locations.Loc;
import Enums.Sex;

abstract public class DeadPerson extends Person{

    public DeadPerson(String n, Sex s) {
        super(n, s,0);
    }
    public DeadPerson(String n, Sex s,Loc l) {
        super(n, s,0,l);
        this.setHeartbeats(0);
    }




}
