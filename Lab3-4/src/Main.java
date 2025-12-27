import ENUM.ENUM.*;
import Exceptions.Exceptions.*;
import characters.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("СТАРТ ИСТОРИИ\n");

        try {
            Crispin crispin = new Crispin();
            April april = new April();

            StoryCharacter they = new StoryCharacter("Они (Враги)", Location.PALACE) {
                @Override
                public void hear(String i, boolean t) {
                }
            };

            System.out.println("Сцена 1: Обман");
            they.hear("Предложение", false);

            try {
                crispin.moveTo(Location.WINDOW);
            } catch (ImpossibleActionException e) {
                System.out.println("ОШИБКА: " + e.getMessage());
                System.out.println("Криспин понимает, что должен сделать выбор.");
            }

            crispin.transform(Form.BIRD);
            crispin.moveTo(Location.WINDOW);

            System.out.println("\nСцена 2: Встреча");
            april.hear("Криспин здесь", true);

            System.out.println("\nСцена 3: Подарки");
            crispin.giveGift("Бриллиантовые сережки", april);

            april.manageJewelry(TimeOfDay.NIGHT);

            crispin.giveGift("Изумрудный браслет", april);
            april.manageJewelry(TimeOfDay.DAY);

        } catch (StoryException e) {
            e.printStackTrace();
        }
    }
}