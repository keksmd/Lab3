package Persons;

import Enums.Sex;
import Locations.Loc;

public class Corpse extends DeadPerson{

    public Corpse(String n, Sex s) {
        super(n, s);
    }

    public Corpse(String n, Sex s, Loc l) {
        super(n, s, l);
    }
}
