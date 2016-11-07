package comp110;

import java.util.ArrayList;
import java.util.List;

/*
 * This class is responsible for managing which "mode" the bot is in, as well as
 * dispatching messages to and from that mode.
 */
public class BotController {

  private List<Responder> _modes;

  /* The constructor initializes instance variables. */
  public BotController(Responder defaultMode) {
    _modes = new ArrayList<Responder>();
    _modes.add(defaultMode);
  }

  /*
   * The dispatch method gets called every time a message is received. It is
   * responsible for finding the correct mode to dispatch a message to and
   * keeping track of what mode the bot should be in.
   */
  public String dispatch(String message) {
    Responder responder = this.findNextMode(message);
    return responder.respondTo(message);
  }

  /*
   * Given a String message, this method *should* find the first mode triggered
   * by the message and return it starting from the last mode added to the list
   * and working back toward the 0th index.
   */
  public Responder findNextMode(String message) {
    // TODO: FIX THIS LOGIC
    return _modes.get(_modes.size() - 1);
  }

  /*
   * More modes can be added to the bot by calling addMode.
   */
  public void addMode(Responder mode) {
    _modes.add(mode);
  }

}