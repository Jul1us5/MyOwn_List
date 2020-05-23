
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
        while (last != null) {
            if (counter == index) {
                return last.value;
            }
            last = last.next;
            counter++;
        }
        return error(101);
    }

    public void remove(int index) {

        if (head != null) {
            Item last = head;
            Item prev = null;
            int counter = 0;
            while (head != null) {
                if (counter == index) {
                    if (prev == null) {
                        head = last.next;
                    } else {
                        prev.next = last.next;
                    }
                    break;
                }
                prev = last;
                last = last.next;
                counter++;
            }
        }
    }

    public void insert(int index, Object o) {
        //
    }

    public void set(int index, Object o) {
        //
    }

    public String error(int problem) {
        if (problem == 100) {
            return "Problem.. Try again!";
        }
        if (problem == 101) {
            return "You cant get existing Object";
        }
        if (problem == 102) {
            return "You cant remove existing Object";
        }
        return "Problem.. Try again!";
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
