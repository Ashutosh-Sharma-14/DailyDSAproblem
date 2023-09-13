package Medium;

class Node{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
public class MergeSortedLinkedList {

    public static void main(String[] args) {

    }
    static Node sortedMerge(Node head1, Node head2) {

        // base conditions
        if(head1 == null) return head2;
        if(head2 == null) return head1;

        Node final_answer = new Node(0);
        Node answer = final_answer;

//        while either one of the
        while(head1!=null && head2!=null){
            if(head1.data <= head2.data){
                answer.next = new Node(head1.data);
                answer = answer.next;
                head1 = head1.next;
            }
            else{
                answer.next = new Node(head2.data);
                answer = answer.next;
                head2 = head2.next;
            }
        }

        while(head1!=null){
            answer.next = new Node(head1.data);
            answer = answer.next;
            head1 = head1.next;
        }

        while(head2!=null){
            answer.next = new Node(head2.data);
            answer = answer.next;
            head2 = head2.next;
        }

        return final_answer.next;
    }
}
