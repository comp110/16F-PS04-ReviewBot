package comp110;

import java.util.ArrayList;
import java.util.List;

/*
 * This class is responsible for managing which "mode" the bot is in, as well as
 * dispatching messages to and from that mode.
 */
public class BotController {

  private List<BotMode> _modes;
  private BotMode _currentMode;

  /* The constructor initializes instance variables. */
  public BotController(BotMode defaultMode) {
    _modes = new ArrayList<BotMode>();
    _modes.add(defaultMode);
    _currentMode = null; // We begin without being in a mode.
  }

  /*
   * The dispatch method gets called every time a message is received. It is
   * responsible for finding the correct mode to dispatch a message to and
   * keeping track of what mode the bot should be in.
   */
  public String dispatch(String message) {

    message = this.cleanUpMessage(message);

    if (_currentMode == null) {
      _currentMode = this.findNextMode(message);
    }

    String response = _currentMode.respondTo(message);

    if (_currentMode.isFinished()) {
      _currentMode = null;
    }

    return response;
  }

  /*
   * Given a String message, this method *should* find the first mode triggered
   * by the message and return it starting from the last mode added to the list
   * and working back toward the 0th index.
   */
  public BotMode findNextMode(String message) {
    // TODO: FIX THIS LOGIC
    return _modes.get(_modes.size() - 1);
  }

  /*
   * More modes can be added to the bot by calling addMode.
   */
  public void addMode(BotMode mode) {
    _modes.add(mode);
  }

  /*
   * This helper method cleans up a String message by converting it to lower
   * case and removing special characters like commas, periods, quotes, and
   * question marks.
   * 
   * Example:
   * 
   * message: Hi, I'm looking for help with "arrays". Can you help me?
   * 
   * returns: hi im looking for help with arrays can you help me
   */
  public String cleanUpMessage(String message) {
    String result = message.toLowerCase(); // Convert the message to lowercase.
    result = result.replaceAll("[,.'\"?]", ""); // Remove special characters.
    result = result.trim(); // Remove leading and trailing spaces.
    return result;
  }

}