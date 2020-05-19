
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
          list.plius("L");
          list.plius("a");
          list.plius("b");
          list.plius("a");
          list.plius("s");
          list.remove(3);
          System.out.println("------");
          System.out.println(list);
          
//          System.out.println(list.get(1));
    }
    
}
