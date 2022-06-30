package Collections_part1_and_Generics;

import java.util.*;

public class LinkedList<E> implements List<E>, Deque<E>{
    private Node<E> begin;
    private Node<E> end;
    private int size;

    public LinkedList() {
        begin = new Node<>();
        end = new Node<>();
        begin.next = end;
        end.prev = begin;
        size = 0;
    }

    private E deleteElement(Node<E> node){    
        E result = null;
        if (node.prev != null && node.next != null) {
            result = node.item;
            node.next.prev = node.prev; 
            node.prev.next = node.next;
        } else if (node.prev == null) {
            result = node.item;
            begin.next = node.next;
            node.next.prev = null;
        } else if (node.next == null) {
            result = node.item;
            end.prev = node.prev;
            node.prev.next = null;
        }
        size--;
        return result;
    }

    @Override
    public void add(int index, E item) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else if (index == size) {
            addLast(item);
        } else if (index == 0) {
            addFirst(item);
        } else {
            Node<E> obj = begin.next;
            for (int i = 0; i < index; i++)
                obj = obj.next;
            Node<E> add = new Node<>(obj.prev, item, obj);
            obj.prev.next = add;
            obj.prev = add;
            size++;
        }
    }

    @Override
    public E get (int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        Node<E> obj = begin.next;
        int i = 0;
        while(i < index){
            obj = obj.next;
            i++;
        }
        return obj.item;
    }

    @Override
    public int indexOf(E item) {
        Node<E> obj = begin.next;
        int i = 0;
        while (i < size){
            if (obj.item == item)
                return i;
            obj = obj.next;
            i++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E item) {
        Node<E> obj = end.prev;
        int i = size - 1;
        while (i >= 0){
            if (obj.item == item)
                return i;
            obj = obj.prev;
            i--;
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            E result = null;
            Node<E> obj = begin.next;
            for (int i = 0; i < index; i++)
                obj = obj.next;
            result = deleteElement(obj);
            return result;
        }
    }

    @Override
    public void set(int index, E item) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else if (index == size) {
            addLast(item);
        } else {
            Node<E> obj = begin.next;
            for (int i = 0; i < index; i++)
                obj = obj.next;
            obj.item = item;
        }
    }

    @Override
    public LinkedList<E> subList(int from, int to) {
        if (from < 0 || to < 0 || to > size || from > to)
            throw new IndexOutOfBoundsException();
        LinkedList<E> linkedList = new LinkedList<>();
        Node<E> obj = begin.next;
        for (int i = 0; i < to; i++) {
            if (i >= from)
                linkedList.addLast(obj.item);
            obj = obj.next;
        }
        return linkedList;
    }

    @Override
    public boolean add(E item) {
        addLast(item);
        return true;
    }

    @Override
    public void clear() {
        Node<E> obj = begin.next;
        while (obj.next != null) {
            deleteElement(obj);
            obj = obj.next;
        }
    }

    @Override
    public boolean contains(E item) {
        Node<E> obj = begin.next;
        while (obj != null){
            if (obj.item == item)
                return true;
            obj = obj.next;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(E item) {
        boolean isDelete = false;
        Node<E> obj = begin.next;
        while (obj.next != null) {
            if (obj.item == item) {
                deleteElement(obj);
                isDelete = true;
            }
            obj = obj.next;
        }
        return isDelete;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addFirst(E item) {
        if (begin.next.equals(end)){
            Node<E> obj = new Node<>(begin, item, end);
            begin.next = obj;
            end.prev = obj;
        } else{
            Node<E> obj = new Node<>(null, item, begin.next);
            begin.next.prev = obj;
            begin.next = obj; 
        }
        size++;
    }

    @Override
    public void addLast(E item) {
        if (end.prev.equals(begin)){
            Node<E> obj = new Node<>(begin, item, end);
            begin.next = obj;
            end.prev = obj;
        } else {
            Node<E> obj = new Node<>(end.prev, item, null);
            end.prev.next = obj;
            end.prev = obj; 
        }
        size++;
    }

    @Override
    public E getFirst() throws NoSuchElementException {
        if (size == 0)
            throw new NoSuchElementException();
        return begin.next.item;
        
    }

    @Override
    public E getLast() throws NoSuchElementException {
        if (size == 0)
            throw new NoSuchElementException();
        return end.prev.item;
    }

    @Override
    public E pollFirst() {
        if (size == 0)
            return null;
        E obj = begin.next.item;
        begin.next.next.prev = begin;
        begin.next = begin.next.next;
        size--;
        return obj;
    }

    @Override
    public E pollLast() {
        if (size == 0)
            return null;
        E obj = end.prev.item;
        end.prev.prev.next = end;
        end.prev = end.prev.prev;
        size--;
        return obj;
    }

    @Override
    public E removeFirst() {
        if (size == 0)
            throw new NoSuchElementException();
        E obj = begin.next.item;
        begin.next.next.prev = begin;
        begin.next = begin.next.next;
        size--;
        return obj;
    }

    @Override
    public E removeLast() {
        if (size == 0)
            throw new NoSuchElementException();
        E obj = end.prev.item;
        end.prev.prev.next = end;
        end.prev = end.prev.prev;
        size--;
        return obj;
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator<>(this);
    }
}
