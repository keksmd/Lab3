package Locations;

import Persons.*;
import Utilites.Delay;
import Utilites.Ownable;

abstract public class Loc extends Ownable {

    private boolean usl = true;
    public boolean getUsl(Person p){
        return usl;
    }
    public Loc(String n) {
        super(n);
    }



    @Override
     public String toString(){
         String[] arr = super.toString().split("@");
         return arr[0];
     }

     public void enter(AlivePerson p){
         if(this.getUsl(p)){
             Delay.delayP(p);
            System.out.println(p.getName()+" входит в локацию " + this.getName());
            p.setLoc(this);
            if(this.toString().equals("Locations.Grave")){
                Grave.Gates.close();
            }
         }else{
             System.out.println("Невозможно войти в локацию");
         }


     }
 }
