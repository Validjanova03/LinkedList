import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
public class LinkedList5 {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(5);
        num.add(1);
        num.add(4);
        num.add(3);
        num.add(2);

        System.out.println("Haqiqiy List: "+num);
        Aralashtirilgan(num);
        System.out.println("Aralashtirilgan List: " + num);

        ArrayList<Integer> arrayList = convertToArrayList(num);
        System.out.println("ArrayList: " + arrayList);

        sortAndCheckElement(num, 4);
        System.out.println("Sorted List: " + num);
    }

    public static void Aralashtirilgan(LinkedList<Integer> num) {
        Collections.shuffle(num);
    }

    public static ArrayList<Integer> convertToArrayList(LinkedList<Integer> num){
        return new ArrayList<>(num);
    }

    public static <Integer extends Comparable<Integer>> void sortAndCheckElement(LinkedList<Integer> num, int i) {
        Collections.sort(num);
        boolean contains = num.contains(i);
        System.out.println("Element borligini aniqlash: " + contains);
    }

}