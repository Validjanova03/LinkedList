import java.util.LinkedList;
import java.util.Iterator;

public class LinkedList1 {
    public static void main(String[] args) {
       LinkedList<String> list = new LinkedList<>();
       list.add("Olcha");
       list.add("Olma");
       list.add("Olxo'ri");
       list.add("Anor");

        System.out.println("Mevalar: ");
        printIterator(list);

        System.out.println("String Hajmi: " + list.size());
        list.clear();
        System.out.printf("Yangi Hajmi: " + list.size());

        }
    private static void printIterator(LinkedList<String> list){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}