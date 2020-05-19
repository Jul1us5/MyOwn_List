
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julius
 */
public class MyOwn_List {

    public static void main(String[] args) {
//        List list = new ArrayList();
//        System.out.println(list.size());
//        list.add("1");
//        System.out.println(list);
//        list.add("2");
//        list.add("Labas");
//        System.out.println(list);
//        System.out.println(list);

          MyList list = new MyList();
          list.add("L");
          list.add("a");
          list.add("b");
          list.add("a");
          list.add("s");
          list.insert(1, "J");
          list.size();
          System.out.println(list.size());
          System.out.println("------");
          System.out.println(list);
          
//          System.out.println(list.get(1));
    }
    
}
