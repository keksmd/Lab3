package Persons;

import Locations.*;
import Enums.*;

abstract public class Person {
    private int hp;
    private final String name;
    private final Sex sex;
    private Speed speed;

    public Speed getSpeed() {
        return speed;
    }

    private int heartbeats;
     public void setHeartbeats(int i){
         this.heartbeats = i;
     }
    public Person(String n,Sex s,int hp){
        this.sex = s;
        this.name = n;
        this.hp = hp;
        Out out = new Out("вне");
        this.loc = out;
        this.speed = Speed.NORMAL;
    }
    public Person(String n,Sex s,int hp,Loc l){
        this.sex = s;
        this.name = n;
        this.hp = hp;
        this.loc = l;
        this.speed = Speed.NORMAL;
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
    public String getName(){
        return this.name;
    }
    public Sex getSex(){
        return this.sex;
    }
    public int getHeartbeats(){
        return this.heartbeats;
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
