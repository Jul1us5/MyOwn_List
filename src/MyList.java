
/**
 *
 * @author Julius
 */
public class MyList {

    private Object[] list;

    public MyList() {
        list = new Object[0];
    }

    public void plius(Object o) {
        Object[] newList = new Object[this.list.length + 1];
        for (int i = 0; i < list.length; i++) {
            newList[i] = this.list[i];

        }
        this.list = newList;
        this.list[this.list.length - 1] = o;
    }
//    public void remove(Object o) {
//        
//    }

    public Object get(int index) {
        if (index >= size()) {
            return error();
        } else {
            return this.list[index];
        }

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
