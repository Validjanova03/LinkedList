import java.util.LinkedList;
import java.util.Locale;
public class LinkedList4 {
    public static void main(String[] args) {
        LinkedList<String> harf1 = new LinkedList<>();
        harf1.add("S");
        harf1.add("A");
        harf1.add("L");

        LinkedList<String> harf2 = new LinkedList<>();
        harf2.add("O");
        harf2.add("M");
        harf2.add("!");



        LinkedList<String> added = adding(harf1,harf2);

        System.out.println(added);
        LinkedList<String> copy = new LinkedList<>(added);
        System.out.println("Copy: "+copy);

        added.removeFirst();

        System.out.println("After removing 1 element: "+ added);


    }
    public static LinkedList<String> adding(LinkedList<String> harf1, LinkedList<String> harf2){
        LinkedList<String> adding = new LinkedList<String>(harf1);
        adding.addAll(harf2);
        return adding;
    }
}
