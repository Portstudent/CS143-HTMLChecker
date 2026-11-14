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
     Queue<HTMLTag> tempQue = new LinkedList<>();
     String returnStr = "";
     int ogSize = tags.size();
     while (tags.size() > 0) {
        returnStr += tags.peek().toString().trim();
        tempQue.add(tags.remove());
     }
     while (tags.size() != ogSize) {
        tags.add(tempQue.remove());
     }
     return returnStr;
  }
  
  public void fixHTML() {
  
  }
  
}
