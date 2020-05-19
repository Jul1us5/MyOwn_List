
/**
 *
 * @author Julius
 */
public class MyList {

    private Object[] list;

    public MyList() {
        list = new Object[0];
    }

    public void add(Object o) {
        Object[] newList = new Object[this.list.length + 1];
        for (int i = 0; i < list.length; i++) {
            newList[i] = this.list[i];

        }
        this.list = newList;
        this.list[this.list.length - 1] = o;
    }

    public Object get(int index) {
        if (index >= size()) {
            return error();
        } else {
            return this.list[index];
        }
    }

    public void remove(int index) {

        Object[] next = new Object[this.list.length - 1];
        for (int i = index; i < list.length - 1; i++) {
            list[i] = list[i + 1];
        }
        for (int x = 0; x < list.length - 1; x++) {
            next[x] = this.list[x];
        }
        this.list = next;
    }
    

    public void insert(int index, Object o) {
        
        Object[] next = new Object[this.list.length];
        for (int i = 0; i < next.length; i++) {
            
            System.out.println(list[2+1]);
            
//           list[index] = o;
//           list[index] = o;
//           list[index + 1] = list[index];
//           list[index] = o;
//                      list[index-1] = o;
//           list[index + 1] = list[i+1];
//           list[index] = o;

            
        }


    }

    public void set(int index, Object o) {
        this.list[index] = o;
    }

    public String error() {
        return "Klaida! Masyva sudaro tik " + size() + " elementu!";
    }

    public int size() {
        return this.list.length;
    }

    public String toString() {
        String s = "MyList{ ";
        for (Object o : list) {
            s += ((o == null) ? "null" : o.toString()) + " ";
        }
        s += "}";
        return s;
    }
}
