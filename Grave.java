package Locations;

import Enums.Sex;
import Enums.Sounds;
import Enums.Thoughts;
import Persons.AlivePerson;
import Persons.Jude;
import Persons.Person;
import Utilites.Delay;

import static Utilites.Delay.delay;

public class Grave extends Loc {

    @Override
    public boolean getUsl(Person p){
        if( Gates.getOpened()){
            return super.getUsl(p);
        }else{
            Gates.open();
            return  super.getUsl(p);
        }
    }
    @Override
    public void enter(AlivePerson p) {
        super.enter(p);
        if (p.getName().equals("Луис")) {
            p.think(Thoughts.LUIS3);
            p.remember(new Jude("Джуд", Sex.MALE), Thoughts.LUIS2);
        }
    }

    public Grave() {
        super("кладбище");
    }
    public static class Gates extends Loc {
        public static boolean opened = false;
        public static void open(){
            delay();
            opened = true;
            System.out.println(Sounds.SKRIP.getSound()+"Ворота открываются");
        }
        public static void close(){
            delay();
            opened = false;
            System.out.println(Sounds.SHELK.getSound()+"Ворота закрываются");
        }
        static public boolean getOpened(){
            return opened;
        }


        public Gates(String n) {
            super(n);
        }
    }
}

