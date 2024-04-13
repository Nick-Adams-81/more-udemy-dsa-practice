package DLL;

public class DLL {
    Node head;
    Node tail;
    int length;

    public DLL(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        for(int i = 0; i < length; i++) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printHead() {
        System.out.println("Head: " + head.value);
    }

    public void printTail() {
        System.out.println("Tail " + tail.value);
    }

    public void printLength() {
        System.out.println("Length: " + length);
    }
 }
