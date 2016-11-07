package comp110;

public interface Responder {

  /*
   * The Controller uses this method to ask each Responder if it will respond to
   * a particular message.
   */
  public boolean willRespondTo(String message);

  /*
   * The respondTo method is given a user's message and will return a response
   * to that message which the bot will then say.
   */
  public String respondTo(String message);

}