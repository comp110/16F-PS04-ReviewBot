package comp110;

public interface Responder {

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

}