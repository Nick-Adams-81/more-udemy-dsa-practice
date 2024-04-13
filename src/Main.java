import DLL.DLL;
import LinkedList.LinkedList;

public class Main {

    public static void main(String[] args) {
//        System.out.println("hello");
//
//        LinkedList list = new LinkedList(1);
//        list.printList();
//        list.printHead();
//        list.printTail();
//        list.printLength();
//
//        list.append(2);
//        list.printList();
//        list.printHead();
//        list.printTail();
//        list.printLength();
//
//        list.prepend(0);
//        list.printList();
//        list.printHead();
//        list.printTail();
//        list.printLength();
//
//        list.removeLast();
//        list.printList();
//        list.printHead();
//        list.printTail();
//        list.printLength();
//
//        list.removeFirst();
//        list.printList();
//        list.printHead();
//        list.printTail();
//        list.printLength();
//
//        list.append(5);
//        list.append(90);
//        list.prepend(14);
//        list.printList();
//
//        System.out.println("Index: " + list.get(1));
//
//        list.set(1, 55);
//        list.printList();
//        System.out.println("\n");
//        list.insert(2, 100);
//        list.insert(3, 200);
//        list.printList();
//        System.out.println("\n");
//        list.remove(3);
//        list.remove(2);
//        list.printList();
//        System.out.println("\n");
//        list.reverse();
//        list.printList();


        DLL dll = new DLL(1);
        dll.printList();
        dll.printHead();
        dll.printTail();
        dll.printLength();

        dll.append(2);
        dll.printList();
        dll.printHead();
        dll.printTail();
        dll.printLength();

        dll.prepend(0);
        dll.printList();
        dll.printHead();
        dll.printTail();
        dll.printLength();

        dll.removeLast();
        dll.printList();
        dll.printHead();
        dll.printTail();
        dll.printLength();

    }
}
