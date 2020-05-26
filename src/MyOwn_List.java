
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julius
 */
public class MyOwn_List {

    public static void main(String[] args) {

//         MyList list = new MyList();
//          list.add("L");
//          list.add("a");
//          list.add("b");
//          list.add("a");
//          list.add("s");
//          System.out.println(list.get(1));
//          System.out.println(list);
        MyList_Interface list = new MyLinkedList();


        try {
            
        list.add("P");
        list.add("a");
        list.add("s");
        list.add("a");
        list.add("u");
        list.add("l");
        list.add("i");
        
        } catch (Exception e) {
            System.out.println("Problem.. Try again!");
        }
        System.out.println(list);
    }

}
