package Persons;

import Enums.*;
import Interfaces.movements;
import Locations.*;

public class UndeadPerson extends AlivePerson implements movements {

    public UndeadPerson(String n, Sex s){
        super(n,s,0);
    }




}
