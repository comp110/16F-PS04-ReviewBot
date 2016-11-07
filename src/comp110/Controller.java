package comp110;

import java.util.ArrayList;
import java.util.List;

/*
 * This class is responsible for managing which "mode" the bot is in, as well as
 * dispatching messages to and from that mode.
 */
public class Controller {

  private List<Responder> _responders;

  /* The constructor initializes instance variables. */
  public Controller(Responder defaultMode) {
    _responders = new ArrayList<Responder>();
    _responders.add(defaultMode);
  }

  /*
   * The dispatch method gets called every time a message is received. It is
   * responsible for finding the correct mode to dispatch a message to and
   * keeping track of what mode the bot should be in.
   */
  public String dispatch(String message) {
    Responder responder;

    // TODO: Find a responder that will respond to this message.
    responder = _responders.get(_responders.size() - 1);

    return responder.respondTo(message);
  }

  public void addResponder(Responder responder) {
    _responders.add(responder);
  }

}