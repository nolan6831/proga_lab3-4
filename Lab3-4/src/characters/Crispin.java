package characters;

import ENUM.ENUM.*;
import Exceptions.Exceptions.*;
import characters.Interfaces.*;

public class Crispin extends StoryCharacter implements Transformer, GiftGiver {
    private Form currentForm;

    public Crispin() {
        super("Криспин", Location.PALACE);
        this.currentForm = Form.HUMAN;
    }

    @Override
    public void transform(Form newForm) {
        this.currentForm = newForm;
        System.out.println("МАГИЯ: " + name + " превратился в " + newForm);
    }

    @Override
    public void moveTo(Location newLocation) throws ImpossibleActionException {
        if (newLocation == Location.WINDOW && currentForm == Form.HUMAN) {
            throw new ImpossibleActionException(name + " не может добраться до окна, пока он Человек! Ему нужно стать Птицей.");
        }

        if (currentForm == Form.BIRD) {
            System.out.println(name + " летит к " + newLocation);
            this.location = newLocation;
        } else {
            super.moveTo(newLocation);
        }
    }

    @Override
    public void giveGift(String item, StoryCharacter receiver) {
        System.out.println(name + " дарит [" + item + "] персонажу " + receiver.getName());
        receiver.addItem(item);
    }

    @Override
    public void hear(String info, boolean isTruth) {
        if (!isTruth) {
            System.out.println(name + " кричит: Это ложь!");
            setEmotion(Emotion.ANGRY);
        }
    }
}