/**
 *
 * @author Julius
 */
public class MyLinkedList {
    
        private Item head;

    public MyLinkedList() {
        head = null;
    }

    public void add(Object o) {
        if(head == null) {
            this.head = new Item();
            this.head.value = o;
        } else {
            
        }
    }

    public void remove(int index) {
        //
    }

    public void insert(int index, Object o) {
        //
    }

    public String error() {
      return null;  
    }

    public int size() {
        return 0;
    }

    public String toString() {
        return null;
    }
    
    
    private class Item {
        Item next;
        Object value;
    }
    
}
