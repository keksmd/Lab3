package Locations;

import Enums.Sex;
import Enums.Thoughts;
import Persons.*;
import Utilites.Delay;

public class GraveTrail extends LocThrough {

    public GraveTrail(String n) {
        super(n);
    }
    @Override
    public void enter(AlivePerson p) {
        super.enter(p);
        if (p.getName().equals("Луис")) {
            p.remember(new Jude("Джуд", Sex.MALE), Thoughts.LUIS2);
        }
        Delay.delayP(p);
    }
}

