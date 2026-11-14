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

     return tags;
  }
  
  public String toString() {
  
     return "";
  }
  
  public void fixHTML() {
  
  }
  
}
