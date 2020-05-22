
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
        Item last = head;
        int counter = 0;
        while(last != null) {
            if(counter == index) {
                return last.value;
            }
            last = last.next;
            counter++;
        }
        return error(101);
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
   

    public String error(int problem) {
        if(problem == 101) {
            return "Problem with LIST length / get() method cant get..";
        }
        return "You have problem..";
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
