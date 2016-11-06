package comp110;

public class DefaultMode implements BotMode {

  public boolean isTriggeredBy(String message) {
    return true;
  }

  public String respondTo(String message) {
    return "Oh em gee, I don't know! Teach me with code!";
  }

  public boolean isFinished() {
    return true;
  }

}
