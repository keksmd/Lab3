package Persons;

import Enums.*;
import Locations.*;

public class UndeadPerson extends AlivePerson implements movements{

    public UndeadPerson(String n, Sex s){
        super(n,s);
        this.setHeartbeats(0);
    }


     public void run(){
         System.out.println(this.getName()+" бежит ");
     }
     public void go(){
         System.out.println(this.getName()+" идет ");
     }
     public void go_to(Loc l){
        this.go();
        l.enter(this);
    }

}
