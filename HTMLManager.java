import java.util.*;

public class HTMLManager {
  private Queue<HTMLTag> tags;
  
  public HTMLManager(Queue<HTMLTag> html) {
     if (html == null) {
        throw new IllegalArgumentException();
     }
     tags = new LinkedList<>(html);
     
  }
  
  public Queue<HTMLTag> getTags() {
     Queue<HTMLTag> returnQ = new LinkedList<>();
  
     return returnQ;
  }
  
  public String toString() {
  
     return "";
  }
  
  public void fixHTML() {
  
  }
  
}
