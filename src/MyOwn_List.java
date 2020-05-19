
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
          list.plius(1);
          list.plius(2);
          list.plius("Labas");
          list.plius(4);
          list.plius(5);
          list.plius(6);
          
          System.out.println(list.get(6));
    }
    
}
