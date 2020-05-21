
/**
 *
 * @author Julius
 */
public class MyLinkedList implements MyList_Interface {

    private Item head;

    public MyLinkedList() {
        head = null;
    }

    public void add(Object o) {
        if (head == null) {
            this.head = new Item();
            this.head.value = o;
        } else {
            Item last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new Item();
            last.next.value = o;
        }
    }
            
    public Object get(int index) {
        
        return null;
    }

    public void remove(int index) {
        if (head == null) {
            System.out.println("This array is empty..");
        } else {

        }
    }

    public void insert(int index, Object o) {
        //
    }

    public void set(int index, Object o) {
        //
    }
   

    public String error() {
        return null;
    }
    
    public int size() {
        if (head == null) {
            return 0;
        } else {
            Item last = head;
            int counter = 1;
            while (last.next != null) {
                last = last.next;
                counter++;
            }

            return counter;
        }
    }

    public String toString() {
        String s = "MyLinkedList{ ";
        Item last = head;
        while (last != null) {
            s += (last.value == null) ? "null" : last.value.toString() + " ";
            last = last.next;
        }
        s += "}";
        return s;
    }

    private class Item {

        Item next;
        Object value;
    }

}
