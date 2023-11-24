package Persons;

import Enums.*;
import Locations.Loc;

abstract public class AlivePerson extends Person implements movements{

    public AlivePerson(String n, Sex s) {
        super(n, s,100);
        this.setHeartbeats(80);
    }
    public void resurrect(DeadPerson dead) {
        if(this.getLoc().equals(dead.getLoc())) {
            System.out.println(this.getName() + " воскрешает " + dead.getName() + "а");
            UndeadPerson undead = new UndeadPerson(dead.getName(), dead.getSex());
            dead = null;
        }
        else{
            System.out.println("Ошибка: чтобы воскресить нужно находиться в одной локации с объектом воскрешения");
        }

    }
    public void run(){System.out.println(this.getName()+" бежит ");}
    public void go(){
        System.out.println(this.getName()+" идет ");
    }
    public void go_to(Loc l){
        this.go();
        l.enter(this);
    }

    public void think(Thoughts t){
        System.out.println(this.getName()+" думаает: "+ t.getThough() );
    }
    public void remember(Person p,Thoughts t){
        System.out.println(this.getName()+" вспомианет слова " +  p.getName()+"а: " + t.getThough());

    }
}

