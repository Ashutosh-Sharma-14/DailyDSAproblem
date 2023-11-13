package Easy;
class Node{
    int data;
    Node next;
    Node(int d){
        this.data = data;
        this.next = null;
    }
}
public class CheckLoopInLinkedList {
    public static void main(String[] args) {

    }

    static boolean detectLoop(Node head){
        if(head == null || head.next == null){
            return false;
        }

        Node slow = head;
        Node fast = head;

        // while condition is applied on fast pointer as it will be ahead of the slow pointer
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}
