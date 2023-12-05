package Persons;

import Enums.*;
import Interfaces.Movements;

public class UndeadPerson extends AlivePerson implements Movements {

    public UndeadPerson(String n, Sex s){
        super(n,s,0);
    }




}
