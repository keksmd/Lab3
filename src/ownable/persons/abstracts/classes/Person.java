package ownable.persons.abstracts.classes;

import enums.*;
import ownable.locations.abstracts.classes.Loc;
import ownable.locations.real.classes.Out;
import ownable.Ownable;

abstract public class Person extends Ownable {
    private int hp;
    private final Sex sex;
    private Speed speed;

        public Speed getSpeed() {
        return speed;
    }

    private int heartbeats;

     public void setHeartbeats(int i){
         if (this.getHeartbeats()<i){
             System.out.println("Сердце "+ this.getName()+"а забилось быстрее: "+i);
         }else  if((this.getHeartbeats()>i)){
             System.out.println("Сердце "+ this.getName()+"а замедлилось до "+i);
         }
         this.heartbeats = i;
     }
    public Person(String n,Sex s,int hp,int hb){
        super(n);
        this.sex = s;
        this.hp = hp;
        this.loc = new Out();
        this.speed = Speed.NORMAL;
        this.heartbeats = hb;
    }
    public Person(String n, Sex s, int hp, int hb, Loc l){
        super(n);
        this.sex = s;
        this.hp = hp;
        this.loc = l;
        this.speed = Speed.NORMAL;
        this.heartbeats = hb;
    }
    private Loc loc;
    public void setLoc(Loc l){
        this.loc = l;
    }
    public Loc getLoc(){
        return this.loc;
    }


    public Sex getSex(){
        return this.sex;
    }
    public int getHeartbeats(){
        return this.heartbeats;
    }

    public void setSpeed(Speed s){
        this.speed = s;
    }

    @Override
    public boolean equals(Object o) {
        if( super.equals(o)){
            Person f = (Person) o;
            return this.hp == f.hp & this.sex == f.sex & this.heartbeats == f.heartbeats & this.speed == f.speed & this.loc == f.loc ;
        }else return false;
    }
}
