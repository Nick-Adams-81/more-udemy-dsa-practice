import LinkedList.LinkedList;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");

        LinkedList list = new LinkedList(1);
        list.printList();
        list.printHead();
        list.printTail();
        list.printLength();

        list.append(2);
        list.printList();
        list.printHead();
        list.printTail();
        list.printLength();

        list.prepend(0);
        list.printList();
        list.printHead();
        list.printTail();
        list.printLength();
    }
}
