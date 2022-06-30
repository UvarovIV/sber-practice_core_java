package Collections_part1_and_Generics;

public class Node<E> {

    E item;
    Node<E> next;
    Node<E> prev;

    public Node(){
        prev = null;
        item = null;
        next = null;
    }

    public Node(Node<E> prev, E item, Node<E> next) {
        this.prev = prev;
        this.item = item;
        this.next = next;
    }
}
