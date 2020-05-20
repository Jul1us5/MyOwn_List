
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julius
 */
public class MyOwn_List {

    public static void main(String[] args) {
          MyList list = new MyList();
          list.add("L");
          list.add("a");
          list.add("b");
          list.add("a");
          list.add("s");
          list.insert(5, "!");
          
          MyList_Interface linked = new MyList();
          
          
          linked.add("Julius");
          linked.remove(0);
          System.out.println(linked);
          System.out.println(list);
    }
    
}
