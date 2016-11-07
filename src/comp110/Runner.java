package comp110;

import comp110.support.BotView;

public class Runner {

  public static void main(String[] args) {

    Responder mode = new DefaultMode();
    BotController controller = new BotController(mode);

    String greeting = "Hi, how can I help you review?";

    // Finally, we give the "view" the controller and the
    // view will call controller's dispatch method each
    // time a message is sent.
    BotView chatBotView = new BotView(greeting, controller);
    chatBotView.run();

  }

}