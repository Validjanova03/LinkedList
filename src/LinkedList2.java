import java.util.LinkedList;
import java.util.Collections;
public class LinkedList2 {
    public static void main(String[] args) {
    LinkedList<Integer> nums = new LinkedList<>();
    nums.add(1);
    nums.add(2);
    nums.add(3);
    nums.add(4);
    nums.add(5);

    addElements(nums,0,6);
      printInReverse(nums);

        System.out.println("Last: "+nums.getLast());
        System.out.println("First: "+nums.getFirst());
    }
    public static void printInReverse(LinkedList <Integer> nums){
        LinkedList<Integer> copyl = new LinkedList<>(nums);
        Collections.reverse(copyl);
        for (Integer e : copyl){
            System.out.println(e);
        }
    }
    public static void addElements(LinkedList <Integer> nums,int Head,int Tail){
        nums.addFirst(Head);
        nums.addLast(Tail);
    }
    }


