import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class JavaCode {

  public static void main(String[] args) {
    JavaCode javaCode = new JavaCode();
    Collection<Integer> collection = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      collection.add(i);
    }
    System.out.println(collection);
    String objJSON = javaCode.toJSON(collection);
    System.out.println(objJSON);
    //System.out.println(collection);
    for (Integer integer : collection) {
      System.out.print(integer);
    }
  }

  public String toJSON(Collection<Integer> collection) {
    StringBuilder sb = new StringBuilder();
    System.out.println("Create the object sb");
    sb.append("[");
    System.out.println("Append [");
    Iterator<Integer> iterator = collection.iterator();
    System.out.println("Create collection.iterator()");
    while (iterator.hasNext()) {
      System.out.println("Iteration...");
      Integer element = iterator.next();
      sb.append(element);
      System.out.println("Append element");
      if (iterator.hasNext()) {
        sb.append(", ");
        System.out.println("If iterator has Next, append \", \"");
      }
    }
    sb.append("]");
    System.out.println("Append ]");
    System.out.println("The end of appending");
    System.out.println("Return new collection to JSON");
    return sb.toString();
  }
}
