public class Searching_LL_DSA {
    public static void main(String[] args) {
        Node temp = head;
        int target = 20;
        while(temp != null){
            if(temp.data == target){
                System.out.println("found element");
            }
            temp = temp.next;
        }
    }
}

//============REVERSE LINKED LIST=================
public class Searching_LL_DSA {
    public static void main(String[] args) {
        Node prev = null;
        Node current = head;
        Node next = null;
    
        while(current != null){
            next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }
        head = prev;
    
    }

}
