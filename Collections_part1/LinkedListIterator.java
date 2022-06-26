package Collections_part1;

import java.util.*;

public class LinkedListIterator implements Iterator<Object> {

    private LinkedList linkedList;
    private int index;

    public LinkedListIterator(LinkedList linkedList) {
        this.linkedList = linkedList;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < linkedList.size();
    }

    @Override
    public Object next() throws NoSuchElementException {
        if (!hasNext())
			throw new NoSuchElementException();
        Object obj = linkedList.get(index);
        index++;
        return obj;
    }
    
}
