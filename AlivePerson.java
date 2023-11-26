package Persons;

import Enums.*;
import Interfaces.movements;
import Locations.Loc;
import Locations.LocThrough;
import Main.Main;
import Utilites.*;

import static Utilites.Delay.delayP;

abstract public class AlivePerson extends Person implements movements {

    public AlivePerson(String n, Sex s) {
        super(n,s,100,80);
    }
    protected AlivePerson(String n, Sex s,int hb) {
        super(n,s,100,hb);
    }
    public void resurrect(DeadPerson dead) {
        if(Main.StoryTell.getTime() == Time.EVENING|Main.StoryTell.getTime() == Time.NIGHT){
            if (this.getLoc().equals(dead.getLoc())) {
                delayP(this);
                System.out.println(this.getName() + " воскрешает " + dead.getName() + "а");
                UndeadPerson undead = new UndeadPerson(dead.getName(), dead.getSex());
                dead = null;
                System.out.println(undead.getName() + ": Ура, я снова <<жив>>!");

            } else {
                System.out.println("При поптыке воскресить возникла ошибка: чтобы воскресить нужно находиться в одной локации с объектом воскрешения");
            }
        }else{
            System.out.println("При поптыке воскресить возникла ошибка: воскрешение возможно только ночью или вечером. Сейчас:" + Main.StoryTell.getTime().getValue() );
        }

    }
    public void run(){
        delayP(this);
        System.out.println(this.getName()+" бежит ");
        this.setHeartbeats(Math.toIntExact(Math.round(this.getHeartbeats() * 1.2)));
    }
    public void go(){
        delayP(this);
        System.out.println(this.getName()+" идет ");
        if(this.getHeartbeats() > 80){
            this.setHeartbeats(80);
        }
    }
    public void go_to(Loc l){
        this.go();
        l.enter(this);
    }


    public void think(Thoughts t){
        delayP(this);
        System.out.println(this.getName()+" думаает: "+ t.getThough() );
    }
    public void remember(Person p,Thoughts t){
        delayP(this);
        System.out.println(this.getName()+" вспомианет слова " +  p.getName()+"а: " + t.getThough());

    }
}

