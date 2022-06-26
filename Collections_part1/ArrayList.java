package Collections_part1;

import java.util.Iterator;

public class ArrayList implements List {

    private Object[] arrayList;
    private int capacity;
    private int size;

    public ArrayList() {
        capacity = 10;
        arrayList = new Object[capacity];
        size = 0;
    }

    private Object[] increaseCapacity() {
        capacity = (capacity * 3) / 2 + 1;
        Object[] newArrayList = new Object[capacity];
        for (int i = 0; i < size; i++) 
            newArrayList[i] = arrayList[i];
        return newArrayList;
    }

    @Override
    public void add(int index, Object item) throws IndexOutOfBoundsException {
        if (size == capacity) 
            arrayList = increaseCapacity();

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else if (index == size) {
            arrayList[index] = item;
            size++;
        } else {
            for (int i = size; i > index; i--)
                arrayList[i] = arrayList[i - 1];
            arrayList[index] = item;
            size++;
        }
    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) 
            throw new IndexOutOfBoundsException(); 
        return arrayList[index];
    }

    @Override
    public int indexOf(Object item) {
        for (int i = 0; i < size; i++) 
            if (arrayList[i].equals(item))
                return i;
        return -1;
    }

    @Override
    public int lastIndexOf(Object item) {
        for (int i = size - 1; i >= 0; i--) 
            if (arrayList[i].equals(item))
                return i;
        return -1;
    }

    @Override
    public Object remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) 
            throw new IndexOutOfBoundsException();
        Object el = arrayList[index];
        for (int i = index; i < size; i++) 
            arrayList[i] = arrayList[i + 1];
        size--;
        return el;
    }

    @Override
    public void set(int index, Object item) throws IndexOutOfBoundsException {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        else if (index == size)
            add(item);
        else 
            arrayList[index] = item;
    }

    @Override
    public ArrayList subList(int from, int to) throws IndexOutOfBoundsException {
        if (from < 0 || to < 0 || to > size || from > to)
            throw new IndexOutOfBoundsException();
        ArrayList subArrayList = new ArrayList();
        for (int i = from; i < to; i++) 
            subArrayList.add(arrayList[i]);
        return subArrayList;
    }

    @Override
    public boolean add(Object item) {
        if (size < capacity)
            arrayList[size] = item;
        else {
            Object[] newArrayList = increaseCapacity();
            newArrayList[size] = item;
            arrayList = newArrayList;
        }
        size++;
        return true;
    }

    @Override
    public void clear() {
        capacity = 10;
        arrayList = new Object[capacity];
        size = 0;
    }

    @Override
    public boolean contains(Object item) {
        for (Object obj : arrayList) 
            if (item.equals(obj)) 
                return true;
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0)
            return true;
        return false;
    }

    @Override
    public boolean remove(Object item) {
        if (size == 0)
            return false;
        int sizeCopy = size;
        for (int i = 0; i < size; i++)
            if (arrayList[i].equals(item)) {
                remove(i);
                remove(item);
                break;
            }
        return !(sizeCopy == size);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<Object> iterator() {
        return new ArrayListIterator(this);
    }

}

