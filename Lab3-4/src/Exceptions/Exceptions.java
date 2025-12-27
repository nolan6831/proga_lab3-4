package Exceptions;

public class Exceptions {

  public static class StoryException extends Exception {
    public StoryException(String message) {
      super(message);
    }
  }

  public static class ImpossibleActionException extends StoryException {
    public ImpossibleActionException(String message) {
      super("НЕВОЗМОЖНОЕ ДЕЙСТВИЕ: " + message);
    }
  }

}