public class MyList {
    private static class Node {
        private int elem;
        private Node next;
    }

    private Node head;

    public MyList() {
        this.head = null;
    }

    public void add(int elem) {
        Node node = new Node();
        node.elem = elem;
        if (head == null) {
            head = node;
        } else {
            Node p = head;
            while (p.next != null)
                p = p.next;
            p.next = node;
        }
    }

    public void print() {
        Node p = head;
        while(p != null) {
            System.out.printf("%3d", p.elem);
            p = p.next;
        }
        System.out.println();
    }
}
