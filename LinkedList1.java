import java.util.Iterator;
import java.util.LinkedList;

class Scratch {
    public static void main(String[] args) {
        LinkedListIterator();
    }

    private static void LinkedListIterator() {
        LinkedList<String> list = new LinkedList<>();
        list.add("ace");
        list.add("base");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}