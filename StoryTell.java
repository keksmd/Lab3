package Main;

import Locations.*;
import Persons.*;
import Enums.*;


public class StoryTell {
    static void go(){
        Luis luis = new Luis("Луис",Sex.MALE);
        Grave grave = new Grave("кладбище");
        Tombs gajes_tomb = new Tombs("могила Гэджа");
        Tombs tomb = new Tombs("могила");
        Jude jude = new Jude("Джуд",Sex.MALE);
        GajeD gajed = new GajeD("Гэдж",Sex.MALE,gajes_tomb);
        GraveTrail trail = new GraveTrail("тропинка");
        grave.enter(luis);
        luis.go_to(trail);
        luis.go_to(gajes_tomb);
        luis.resurrect(gajed);

    }
}
