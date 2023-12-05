package Main;


import Enums.*;
import Items.*;
import Locations.*;
import Persons.*;

public class Main {
    public static void main(String[] args) {

        StoryTell.setTime(Time.EVENING);
        StoryTell.setStory();
        StoryTell.story();
    }
    public static class StoryTell {
        private static Time time;

        public static void setTime(Time time) {
            StoryTell.time = time;
        }
        public static Time getTime() {
            return time;
        }

        static void story(){
            Luis luis = new Luis("Луис", Sex.MALE);
            Grave grave = new Grave();
            Tombs gajes_tomb = new Tombs("могила Гэджа");
            Allley alley = new Allley();
            Tombs tomb = new Tombs("могила");
            Jude jude = new Jude("Джуд",Sex.MALE);
            GajeD gajed = new GajeD("Гэдж",Sex.MALE,gajes_tomb);
            GraveTrail trail = new GraveTrail();
            Food apple = new Food(50,ItemSeize.SMALL,"blyadskoe yabloko");
            Corpse dead_jude = luis.kill(jude);
            luis.resurrect(dead_jude);
            grave.enter(luis);
            luis.run();
            luis.go_to(trail);
            luis.go_to(alley);
            luis.go_to(gajes_tomb);
            luis.resurrect(gajed);

        }
        static void setStory(){
            System.out.println("за окном " + time.getValue());
        }
    }

}