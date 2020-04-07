import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

/**
 * Complete the insert function in your editor so that it creates a new Node (pass data as the Node constructor
 * argument) and inserts it at the tail of the linked list referenced by the head parameter. Once the new node is added,
 * return the reference to the  node.
 * <p>
 * Note: If the head argument passed to the insert function is null, then the initial list is empty.
 */
class Day15_LinkedList_Solution {

    /**
     * Insert function should return a reference to the head node of the linked list.
     */
    public static Node insert(Node head, int data) {
        if (head == null) {
            head = new Node(data);
            return head;
        }

        Node lastNode = head;
        while (lastNode != null) {
            if (lastNode.next == null) {
                break;
            }
            lastNode = lastNode.next;
        }
        lastNode.next = new Node(data);

        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}