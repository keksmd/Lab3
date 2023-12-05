package Persons;

import Enums.*;
import Interfaces.*;
import Items.Food;
import Items.Item;
import Locations.Loc;
import Main.Main;
import Utilites.*;


import static Utilites.Delay.delayP;

abstract public class AlivePerson extends Person implements Movements, ItemActions, BrainActivity {

    public AlivePerson(String n, Sex s) {
        super(n,s,100,80);
        this.stamina = 100;
    }
    protected AlivePerson(String n, Sex s,int hb) {
        super(n,s,100,hb);
        this.stamina = 100;
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
    public Corpse kill(AlivePerson p){
        System.out.println(this.getName() + " убивает "+ p.getName());
        Corpse d  = new Corpse(p.getName(),p.getSex(),p.getLoc());
        p = null;
        return d;

    }
    private int stamina;

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) throws MyExeption {
        if(stamina<=100&0<=stamina) {
            this.stamina = stamina;
        }else{
            throw new MyExeption("Stamina не может быть больше 100 или меньше 0.");
        }
    }
    public void eat(Food f){
        if (!f.getOwner().equals(this)) {
            System.out.println("Чтобы съесть еду она должна находиться в вашем инвернтаре");
        } else {
            if (this.stamina + f.getCalories() > 100) {
                this.stamina = 100;
            } else {
                this.stamina += f.getCalories();
            }
            System.out.println(this.getName()+" съел " + f.getName()+" и восстановил "+ f.getCalories() +" стамины,теперь: " + this.getStamina());

            f = null;
        }
    }

    public void run(){
        if(this.getStamina()>20){
            delayP(this);
            System.out.println(this.getName()+" бежит ");
            this.setHeartbeats(Math.toIntExact(Math.round(this.getHeartbeats() * 1.2)));
            try {
                this.setStamina(this.getStamina()-20);
            } catch (MyExeption e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println(this.getName() + " слишком устал чтобы бежать");
        }
    }
    public void go(){
        if(this.getStamina()>5){
            delayP(this);
            System.out.println(this.getName()+" идет ");
            if(this.getHeartbeats() > 80){
                this.setHeartbeats(80);
            }
            try {
                this.setStamina(this.getStamina()-5);
            } catch (MyExeption e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println(this.getName() + " слишком устал чтобы идти");
        }
    }
    public void go_to(Loc l){
        if(this.getStamina()>5) {
            this.go();
            l.enter(this);
        } else {
        System.out.println(this.getName() + " слишком устал чтобы идти");
    }
    }


    public void think(Thoughts t){
        delayP(this);
        System.out.println(this.getName()+" думаает: "+ t.getThough() );
    }
    public void remember(Person p,Thoughts t){
        delayP(this);
        System.out.println(this.getName()+" вспомианет слова " +  p.getName()+"а: " + t.getThough());

    }
    public void say(String s) {
        System.out.println(this.getName()+": "+"<<"+s+">>");
    }

    public void take(Item i){
       if(i.getOwner().equals(this.getLoc())) {
            i.setOwner(this);
        }else{
           System.out.println("Взять можно только объект,который находится с вами в одной локации");
       }
    };
    public void put(Item i){
        if(i.getOwner().equals(this)) {
            i.setOwner(this.getLoc());
        }else{
            System.out.println(i.getName()+" не принадлежит вам");
        }

    }
}

