package TrainingClassesPractice._15thAugust;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class linkedlist {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(25);

//        head = deleteBeg(head);
        head = reverse(head);
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.println(temp.data);
        }

        //System.out.println("Maximum: " + getMaximum(head));
    }

    private static Node insertAtEnd(Node head, int n) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(n);
        return head;
    }

    public static Node insertAtStart(Node head, int n) {
        Node temp = new Node(n);
        temp.next = head;
        return temp;
    }

    // after val we need to insert key
    public static Node atSpecific(Node head, int val, int key) {
        Node temp = head;

        while (temp.next != null) {
            if (temp.data == val) {

            }
        }
        return null;
    }

    static Node deleteEnd(Node head) {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    static Node deleteBeg(Node head) {
        return head.next;
    }

    static int getMaximum(Node head) {
        Node temp = head;
        int max = temp.data;
        while (temp != null) {
            if (temp.data > max) {
                max = temp.data;
            }
            temp = temp.next;
        }
        return max;
    }

    // 1 --> 2 --> 3 --> 4 -- > null
    // 0 <-- 1 <-- 2 <-- 3 <-- 4
    static Node reverse(Node head) {
        Node newNode = null;
        while (head != null) {
            Node temp = head.next;
            head.next = newNode;
            newNode = head;
            head = temp;
        }
        return newNode;
    }
}