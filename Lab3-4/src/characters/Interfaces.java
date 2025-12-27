package characters;

import ENUM.ENUM.*;
import Exceptions.Exceptions.*;

public interface Interfaces {

    interface Movable {
        void moveTo(Location location) throws ImpossibleActionException;
    }

    interface Transformer {
        void transform(Form newForm);
    }

    interface GiftGiver {
        void giveGift(String item, StoryCharacter receiver);
    }

}