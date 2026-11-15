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
     Stack<HTMLTag> stack = new Stack<>();
     Queue<HTMLTag> finalQue = new LinkedList<>();
     
     while (!tags.isEmpty()) {
        if (tags.peek().isOpening()) {
           stack.push(tags.peek());
           finalQue.add(tags.remove());
        } else if (tags.peek().isClosing()) {
           if (stack.isEmpty()) {
             tags.remove();
           } else if (tags.peek().matches(stack.peek())) {
              finalQue.add(tags.remove());
              stack.pop();
           } else {
              finalQue.add(stack.pop().getMatching());
           }
        } else if (tags.peek().isSelfClosing() || tags.peek().isComment()) {
           finalQue.add(tags.remove());
        } 
     }
     
     while (!stack.isEmpty()) {
        finalQue.add(stack.pop().getMatching());
     }
     
     tags = finalQue;
  }
  
}
