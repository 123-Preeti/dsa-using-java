class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListDSA {

    public static void main(String[] args) {

        // Create nodes
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Connect nodes
        first.next = second;
        second.next = third;

        // Traversal
        Node temp = first;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

//Also comment out this entire

void main() {
}
//insertion

        //traversal
//    class Node {
//
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//    }
//}
//
//public class Demo {
//
//    public static void main(String[] args) {
//
//        Node first = new Node(10);
//        first.next = new Node(20);
//        first.next.next = new Node(30);
//
//        Node temp = first;
//
//        while(temp != null) {
//
//            System.out.println(temp.data);
//
//            temp = temp.next;
//        }
//    }
//}

        //insertion at beginning


//        Node head = new Node(10);
//
//        // New node
//         Node newNode = new Node(20);
//
//        // Insert at beginning
//            newNode.next = head;
//
//        head = newNode;
//
//        // Traversal
//        Node temp = head;
//
//        while(temp != null) {
//
//            System.out.println(temp.data);
//
//            temp = temp.next;
//        }
//    }


    //insertion at end
//
//    Node head = new Node[10];
//    head.next = new Node(20);
//
//    Node temp = head;
//
//    while(temp != null){
//        temp = temp.next;
//
//        temp.next = new Node(30);
//
//        temp = head;
//        while(temp != null){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
//    }
//
//    //insertion at middle
//
//    Node head = new Node(10);
//    head.next = new Node(30);
//    Node newNode = new Node(20);
//    newNode.next = head.next;
//
//    head.next = newNode;
//    Node temp = head;
//
//        //deletion of first node
//
//        Node head = new Node(10);
//        head.next = new Node(20);
//
//        head = head.next;
//        Node temp = head;
//
//        //delete last node
//
//        Node(int data){
//            this .data = data;
//        }
//        Node haed = new Node(10);
//        head.next = new Node(20);
//        head.next.next = new Node(30);
//
//        Node temp = head;
//
//        while(temp.next.next != null){
//            temp.next = null;
//        }
        


    