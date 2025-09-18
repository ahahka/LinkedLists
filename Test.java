import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyCircularLinkedList<Integer> myList = new MyCircularLinkedList<>();
        myList.addToEnd(20);
        myList.addToFront(30);
        myList.addToEnd(40);
        System.out.println(myList.contains(20));
        System.out.println(Arrays.toString(myList.toArray()));
        //try {
        //    myList.removeFromFront();
        //} catch (NullPointerException e) {
        //    System.out.println("Tried to remove from an empty list.");
        //}
        System.out.println(myList);
    }
}
