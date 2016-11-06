package comp110;

public interface BotMode {

  /*
   * isTriggeredBy is used to ask a BotMode implementation if a particular
   * message matches something it can respond to. If so, it will return true. If
   * not, it will return false.
   */
  public boolean isTriggeredBy(String message);

  /*
   * The respondTo method is given a user's message and will return a response
   * to that message which the bot will then say.
   */
  public String respondTo(String message);

  /*
   * When the mode is completed, this method will return true causing the
   * Controller to "exit" the mode. Otherwise, if it returns true, the bot will
   * remain in this given mode for the next interaction.
   */
  public boolean isFinished();

}