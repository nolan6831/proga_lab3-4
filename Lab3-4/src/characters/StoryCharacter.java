package characters;

import ENUM.ENUM.*;
import Exceptions.Exceptions.*;
import characters.Interfaces.*;

import java.util.ArrayList;
import java.util.List;

public abstract class StoryCharacter implements Movable {
    protected String name;
    protected Emotion emotion;
    protected Location location;
    protected List<String> inventory;

    public StoryCharacter(String name, Location location) {
        this.name = name;
        this.location = location;
        this.emotion = Emotion.NEUTRAL;
        this.inventory = new ArrayList<>();
    }

    public void setEmotion(Emotion emotion) {
        this.emotion = emotion;
        System.out.println("LOG: " + name + " теперь чувствует " + emotion);
    }

    public void addItem(String item) {
        inventory.add(item);
        System.out.println(name + " получил(а): " + item);
    }

    public String getName() {
        return name;
    }


    @Override
    public void moveTo(Location newLocation) throws ImpossibleActionException {
        this.location = newLocation;
        System.out.println(name + " идет в локацию " + newLocation);
    }

    public abstract void hear(String info, boolean isTruth);
}