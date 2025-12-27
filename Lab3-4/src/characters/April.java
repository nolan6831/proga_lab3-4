package characters;

import ENUM.ENUM.*;

public class April extends StoryCharacter {

    public April() {
        super("Эйприл", Location.WINDOW);
        setEmotion(Emotion.SAD);
    }

    @Override
    public void hear(String info, boolean isTruth) {
        if (info.contains("Криспин") && isTruth) {
            System.out.println("Эйприл понимает, что Криспин говорит правду.");
            setEmotion(Emotion.HAPPY);
        }
    }

    public void manageJewelry(TimeOfDay time) {
        if (inventory.isEmpty()) {
            System.out.println("У Эйприл пока нет украшений.");
            return;
        }

        if (time == TimeOfDay.NIGHT) {
            System.out.println("Наступила НОЧЬ. Эйприл надевает все свои " + inventory.size() + " украшений, чтобы понравиться Криспину.");
        } else {
            System.out.println("Наступил ДЕНЬ. Эйприл прячет украшения в шкатулки.");
        }
    }
}