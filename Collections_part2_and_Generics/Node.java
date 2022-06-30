package Collections_part2_and_Generics;

public class Node<E> {
    private E value;
    private Node<E> left;
    private Node<E> right;
    private Node<E> parent;

    public Node<E> getParent() {
        return parent;
    }

    public void setParent(Node<E> parent) {
        this.parent = parent;
    }

    Node(E value) {
        this.value = value;
        right = null;
        left = null;
        parent = null;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getLeft() {
        return left;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }
}