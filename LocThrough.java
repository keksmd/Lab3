package Locations;

import Persons.*;
import Utilites.*;

import static java.lang.Thread.sleep;

abstract public class LocThrough extends Loc {

    public LocThrough(String n) {
        super(n);
    }
    @Override
    public void enter(AlivePerson p){
        System.out.println(p.getName()+" идет по локации " + this.getNazv());
        p.setLoc(this);
        Delay.delayP(p);
    }
}
