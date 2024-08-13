import java.util.LinkedList;
public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>();
        str.add("Lemon");
        str.add("Grapes");
        str.add("Ananas");
        str.add("Apple");
        str.add("Cherry");

        System.out.println("Mevalar: "+str);
        removeByIndex(str,3);
        System.out.println("Mevalar keyin: "+str);

        str.clear();
        System.out.println("To’plamining barcha elementlari o’chirildi!"+ str);


    }
public static void removeByIndex(LinkedList<String> str, int index) {
        if (index >= 0 && index < str.size()) {
            str.remove(index);
            System.out.println(index + " - indeksdagi element olib tashlandi! ");
        } else {
            System.out.println("Bunday indeks topilmadi.");
        }
    }
}
