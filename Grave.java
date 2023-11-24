package Locations;

import Enums.Sounds;
import Enums.Thoughts;
import Persons.AlivePerson;
import Utilites.Delay;

import static Utilites.Delay.delay;

public class Grave extends Loc {

    @Override
    public boolean getUsl(){
        if( Gates.getOpened()){
            return super.getUsl();
        }else{
            Gates.open();
            return  super.getUsl();
        }
    }
    @Override
    public void enter(AlivePerson p) {
        super.enter(p);
        if (p.getName().equals("Луис")) {
            p.think( Thoughts.LUIS1);
        }
        Delay.delayP(p);
    }

    public Grave(String n) {
        super(n);
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

