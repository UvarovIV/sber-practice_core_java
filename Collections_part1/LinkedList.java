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

    private Object deleteElement(Node node){    
        Object result = null;
        if (node.prev != null && node.next != null){
            result = node.item;
            node.next.prev = node.prev; 
            node.prev.next = node.next;
        } else if (node.prev == null){
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
    public void add(int index, Object item) throws NoSuchElementException {
        if (index < 0 || index > size) {
            throw new NoSuchElementException();
        } else if (index == size) {
            addLast(item);
        } else if (index == 0) {
            addFirst(item);
        } else {
            Node obj = begin.next;
            for (int i = 0; i < index; i++)
                obj = obj.next;
            Node add = new Node(obj.prev, item, obj);
            obj.prev.next = add;
            obj.prev = add;
            size++;
        }
    }

    @Override
    public Object get (int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size)
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
        Node obj = end.prev;
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
    public Object remove(int index) throws NoSuchElementException {
        if (index < 0 || index >= size) {
            throw new NoSuchElementException();
        } else {
            Object result = null;
            Node obj = begin.next;
            for (int i = 0; i < index; i++)
                obj = obj.next;
            result = deleteElement(obj);
            return result;
        }
    }

    @Override
    public void set(int index, Object item) throws NoSuchElementException {
        if (index < 0 || index > size) {
            throw new NoSuchElementException();
        } else if (index == size) {
            addLast(item);
        } else {
            Node obj = begin.next;
            for (int i = 0; i < index; i++)
                obj = obj.next;
            obj.item = item;
        }
    }

    @Override
    public LinkedList subList(int from, int to) throws IndexOutOfBoundsException {
        if (from < 0 || to < 0 || to > size || from > to)
            throw new IndexOutOfBoundsException();
        LinkedList linkedList = new LinkedList();
        Node obj = begin.next;
        for (int i = 0; i < to; i++) {
            if (i >= from)
                linkedList.addLast(obj.item);
            obj = obj.next;
        }
        return linkedList;
    }

    @Override
    public boolean add(Object item) {
        addLast(item);
        return true;
    }

    @Override
    public void clear() {
        Node obj = begin.next;
        while (obj.next != null) {
            deleteElement(obj);
            obj = obj.next;
        }
    }

    @Override
    public boolean contains(Object item) {
        Node obj = begin.next;
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
    public boolean remove(Object item) {
        boolean isDelete = false;
        Node obj = begin.next;
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
    public void addFirst(Object item) {
        if (begin.next.equals(end)){
            Node obj = new Node(begin, item, end);
            begin.next = obj;
            end.prev = obj;
        } else{
            Node obj = new Node(null, item, begin.next);
            begin.next.prev = obj;
            begin.next = obj; 
        }
        size++;
    }

    @Override
    public void addLast(Object item) {
        if (end.prev.equals(begin)){
            Node obj = new Node(begin, item, end);
            begin.next = obj;
            end.prev = obj;
        } else {
            Node obj = new Node(end.prev, item, null);
            end.prev.next = obj;
            end.prev = obj; 
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
        Object obj = begin.next.item;
        begin.next.next.prev = begin;
        begin.next = begin.next.next;
        size--;
        return obj;
    }

    @Override
    public Object pollLast() {
        if (size == 0)
            return null;
        Object obj = end.prev.item;
        end.prev.prev.next = end;
        end.prev = end.prev.prev;
        size--;
        return obj;
    }

    @Override
    public Object removeFirst() {
        if (size == 0)
            throw new NoSuchElementException();
        Object obj = begin.next.item;
        begin.next.next.prev = begin;
        begin.next = begin.next.next;
        size--;
        return obj;
    }

    @Override
    public Object removeLast() {
        if (size == 0)
            throw new NoSuchElementException();
        Object obj = end.prev.item;
        end.prev.prev.next = end;
        end.prev = end.prev.prev;
        size--;
        return obj;
    }

    @Override
    public Iterator<Object> iterator() {
        return new LinkedListIterator(this);
    }
}
