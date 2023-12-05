package Persons;

import Locations.*;
import Enums.*;
import Utilites.Ownable;

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
        Out out = new Out();
        this.loc = out;
        this.speed = Speed.NORMAL;
        this.heartbeats = hb;
    }
    public Person(String n,Sex s,int hp,int hb,Loc l){
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

    @Override
    public String toString(){
        String[] arr = super.toString().split("@");
        return arr[0];
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
    public boolean equals(Object obj) {
        if (this.toString().equals(obj.toString())) {
            return true;
        } else {
            return false;
        }
    }
}
