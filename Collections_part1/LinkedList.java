package Collections_part1;

import java.util.*;

public class LinkedList implements List, Deque{
    private Node begin;
    private Node end;
    private int size;

    public LinkedList() {
        begin = new Node();
        end = new Node();
        begin.next = end;
        end.prev = begin;
        size = 0;
    }

    private void deleteElement(Node node){    
        if (node.prev != null && node.next != null){
            node.next.prev = node.prev; 
            node.prev.next = node.next;
        } else if (node.prev == null){
            begin.next = node.next;
            node.next.prev = null;
        } else if (node.next == null) {
            end.prev = node.prev;
            node.prev.next = null;
        }
        size--;
    }

    @Override
    public void add(int index, Object item) {
        // TODO Auto-generated method stub
    }

    @Override
    public Object get (int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        Node obj = begin.next;
        int i = 0;
        while(i < index){
            obj = obj.next;
            i++;
        }
        return obj.item;
    }

    @Override
    public int indexOf(Object item) {
        Node obj = begin.next;
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
    public int lastIndexOf(Object item) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Object remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void set(int index, Object item) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List subList(int from, int to) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean add(Object item) {
        addLast(item);
        return true;
    }

    @Override
    public void clear() {
        Node buff = begin.next;
        while (buff.next != null) {
            deleteElement(buff);
            buff = buff.next;
        }
        
    }

    @Override
    public boolean contains(Object item) {
        Node buff = begin.next;
        while (buff != null){
            if (buff.item == item)
                return true;
            buff = buff.next;
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
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addFirst(Object item) {
        if (begin.next.equals(end)){
            Node el = new Node(begin, item, end);
            begin.next = el;
            end.prev = el;
        } else{
            Node el = new Node(null, item, begin.next);
            begin.next.prev = el;
            begin.next = el; 
        }
        size++;
    }

    @Override
    public void addLast(Object item) {
        if (end.prev.equals(begin)){
            Node el = new Node(begin, item, end);
            begin.next = el;
            end.prev = el;
        } else {
            Node el = new Node(end.prev, item, null);
            end.prev.next = el;
            end.prev = el; 
        }
        size++;
    }

    @Override
    public Object getFirst() throws NoSuchElementException {
        if (size == 0)
            throw new NoSuchElementException();
        return begin.next.item;
        
    }

    @Override
    public Object getLast() throws NoSuchElementException {
        if (size == 0)
            throw new NoSuchElementException();
        return end.prev.item;
    }

    @Override
    public Object pollFirst() {
        if (size == 0)
            return null;
        Object el = begin.next.item;
        begin.next.next.prev = begin;
        begin.next = begin.next.next;
        size--;
        return el;
    }

    @Override
    public Object pollLast() {
        if (size == 0)
            return null;
        Object el = end.prev.item;
        end.prev.prev.next = end;
        end.prev = end.prev.prev;
        size--;
        return el;
    }

    @Override
    public Object removeFirst() {
        if (size == 0)
            throw new NoSuchElementException();
        Object el = begin.next.item;
        begin.next.next.prev = begin;
        begin.next = begin.next.next;
        size--;
        return el;
    }

    @Override
    public Object removeLast() {
        if (size == 0)
            throw new NoSuchElementException();
        Object el = end.prev.item;
        end.prev.prev.next = end;
        end.prev = end.prev.prev;
        size--;
        return el;
    }
}
