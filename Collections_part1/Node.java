package Collections_part1;

public class Node {

    Object item;
    Node next;
    Node prev;

    public Node(Node prev, Object item, Node next) {
        this.prev = prev;
        this.item = item;
        this.next = next;
    }

    public Node(){
        prev = null;
        item = null;
        next = null;
    }

    public void setNode(Node prev, Object item, Node next) {
        this.prev = prev;
        this.item = item;
        this.next = next;
    }
}
