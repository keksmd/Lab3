package Interfaces;

import Enums.Thoughts;
import Persons.Person;

public interface BrainActivity {
    public void say(String s);
    public void think(Thoughts t);
    public void remember(Person p, Thoughts t);
}
