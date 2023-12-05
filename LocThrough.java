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
        Delay.delayP(p);
        System.out.println(p.getName()+" идет по локации " + this.getName());
        p.setLoc(this);
    }
}
