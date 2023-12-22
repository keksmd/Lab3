package main;


import enums.*;
import items.*;
import ownable.locations.real.classes.Allley;
import ownable.locations.real.classes.Grave;
import ownable.locations.real.classes.GraveTrail;
import ownable.locations.real.classes.Tombs;
import ownable.persons.real.classes.DeadGaje;
import ownable.persons.real.classes.Jude;
import ownable.persons.real.classes.Luis;

public class Main {
    public static void main(String[] args) {

        StoryTell.setTime(Time.EVENING);
        StoryTell.setStory();
        StoryTell.storyGo();
    }
    public static class StoryTell {
        private static Time time;

        public static void setTime(Time time) {
            StoryTell.time = time;
        }
        public static Time getTime() {
            return time;
        }

        static void storyGo(){
            Luis luis = new Luis("Луис", Sex.MALE);
            Grave grave = new Grave();
            Tombs gajesTomb = new Tombs("могила Гэджа");
            Allley alley = new Allley();
            Tombs tomb = new Tombs("могила");
            Jude jude = new Jude("Джуд",Sex.MALE);
            DeadGaje gajed = new DeadGaje("Гэдж",Sex.MALE,gajesTomb);
            GraveTrail trail = new GraveTrail();
            Food apple = new Food(50,ItemSeize.SMALL,"яблоко");
            grave.enter(luis);
            luis.run();
            luis.goTo(trail);
            luis.goTo(alley);
            luis.goTo(gajesTomb);
            luis.resurrect(gajed);

        }
        static void setStory(){
            System.out.println("за окном " + time.getValue());
        }
    }

}