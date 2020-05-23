
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
        MyList_Interface list = new MyLinkedList();

        list.add("P");
        list.add("a");
        list.add("s");
        list.add("a");
        list.add("u");
        list.add("l");
        list.add("i");

        System.out.println(list);
    }

}
