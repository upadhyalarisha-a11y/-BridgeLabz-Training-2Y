class Reverse {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to reverse linked list
    static Node reverse(Node head) {

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {

            next = current.next;    // Step 1: store next
            current.next = prev;    // Step 2: reverse link
            prev = current;         // Step 3: move prev
            current = next;         // Step 4: move current
        }

        return prev;  // new head
    }

    // Function to print linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Creating linked list: 10 -> 20 -> 30
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Original List:");
        printList(head);

        head = reverse(head);

        System.out.println("Reversed List:");
        printList(head);
    }
}
