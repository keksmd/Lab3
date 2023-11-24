package Locations;

import Persons.*;
import Utilites.Delay;

abstract public class Loc {
    private final String nazv;
    private boolean usl = true;
    public boolean getUsl(){
        return usl;
    }
    public Loc(String n) {
        nazv = n;
    }

    public String getNazv() {
        return nazv;
    }


    @Override
     public String toString(){
         String[] arr = super.toString().split("@");
         return arr[0];
     }

     public void enter(AlivePerson p){
         if(this.getUsl()){
            System.out.println(p.getName()+" входит в локацию " + this.nazv);
            p.setLoc(this);
            if(this.toString().equals("Locations.Grave")){
                Grave.Gates.close();
            }
         }else{
             System.out.println("Невозможно войти в локацию");
         }
         Delay.delayP(p);

     }
 }
