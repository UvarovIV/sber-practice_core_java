package Collections_part2_and_Generics;

import Collections_part1_and_Generics.ArrayList;
import Collections_part1_and_Generics.Collection;

public class TreeMap<K, V> implements Map<K, V> {

    private Node<Entry<K, V>> root;
    private int size;
    private boolean isSearch = false;

    public TreeMap() {
        root = null;
        size = 0;
    }

    private K getKey(Node<Entry<K, V>> node) {
        return ((Entry<K, V>) node.getValue()).getKey();
    }

    private V getValue(Node<Entry<K, V>> node) {
        return ((Entry<K, V>) node.getValue()).getValue();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }

    @Override
    public boolean containsKey(K key) {
        isSearch = false;
        return searchKey(root, key);
    }

    private boolean searchKey(Node<Entry<K, V>> child, K key) {
        
        if (key.equals(getKey(child)))
            isSearch = true;

        if (child.getLeft() != null && !isSearch)
            searchKey(child.getLeft(), key);

        if (child.getRight() != null && !isSearch)
            searchKey(child.getRight(), key);

        return isSearch;
    }

    @Override
    public boolean containsValue(V value) {
        isSearch = false;
        return searchValue(root, value);
    }

    private boolean searchValue(Node<Entry<K, V>> child, V value) {
        
        try {
            
            if (value.equals(getValue(child)))
                isSearch = true;

        } catch (NullPointerException ex) {
            
            if (value == null)
                isSearch = true;
                
        }

        if (child.getLeft() != null && !isSearch) 
            searchValue(child.getLeft(), value);

        if (child.getRight() != null && !isSearch)
            searchValue(child.getRight(), value);

        return isSearch;
    }

    @Override
    public V get(K key) {
        
        Node<Entry<K, V>> child = root;
        
        while (true) {
            
            if (key.equals(getKey(child)))

                return getValue(child);

            else if (key.hashCode() < getKey(child).hashCode()) {
                
                child = child.getLeft();
                
                if (child == null)
                    return null;
    
            } else {

                child = child.getRight();

                if (child == null)
                    return null;

            }
        }
    }

    @Override
    public Entry<K, V> put(K key, V value) {
        
        Node<Entry<K, V>> newNode = new Node<>(new Entry<>(key, value));
        
        if (root == null) {

            size++;
            root = newNode;

        } else {
            
            Node<Entry<K, V>> parent;
            Node<Entry<K, V>> child = root;
            
            while (true) {
                
                parent = child;
                
                if (getKey(child).equals(key)) {

                    child.setValue(new Entry<>(key, value));
                    return newNode.getValue();

                } else if (key.hashCode() < getKey(child).hashCode()) {
                    
                    child = child.getLeft();
                    
                    if (child == null) {
                        parent.setLeft(newNode);
                        size++;
                        return newNode.getValue();
                    }

                } else {
                    
                    child = child.getRight();
                    
                    if (child == null) {
                        parent.setRight(newNode);
                        size++;
                        return newNode.getValue();
                    }

                }
            }
        }
        return newNode.getValue();
    }

    @Override
    public V remove(K key) {

        Node<Entry<K, V>> parent = root;
        Node<Entry<K, V>> child = root;
        boolean isLeft = true;

        while (!key.equals(getKey(child))) {
            
            parent = child;

            if (key.hashCode() < getKey(child).hashCode()) {
                
                isLeft = true;
                child = child.getLeft();

            } else {
                
                isLeft = false;
                child = child.getRight();

            }

            if (child == null)
                return null;
        }

        if (child.getLeft() == null && child.getRight() == null) {
            
            if (child == root) 
                root = null;
            else if (isLeft)
                parent.setLeft(null);
            else
                parent.setRight(null);

        }

        else if (child.getRight() == null) {
            
            if (child == root)
                root = child.getLeft();
            else if (isLeft)
                parent.setLeft(child.getLeft());
            else
                parent.setRight(child.getLeft());

        }

        else if (child.getLeft() == null) {
            
            if (child == root)
                root = child.getRight();
            else if (isLeft)
                parent.setLeft(child.getRight());
            else
                parent.setRight(child.getRight());

        }

        else {
            
            Node<Entry<K, V>> heir = replaceNode(child);
            
            if (child == root)
                root = heir;
            else if (isLeft)
                parent.setLeft(heir);
            else
                parent.setRight(heir);
            
        }

        size--;
        return getValue(child);

    }

    private Node<Entry<K, V>> replaceNode(Node<Entry<K, V>> node) {

        Node<Entry<K, V>> parent = node;
        Node<Entry<K, V>> heirNode = node;
        Node<Entry<K, V>> child = node.getRight();

        while (child != null) {

            parent = heirNode;
            heirNode = child;
            child = child.getLeft();

        }

        if (heirNode != node.getRight()) {

            parent.setLeft(heirNode.getRight());
            heirNode.setRight(node.getRight());
            heirNode.setLeft(node.getLeft());

        } else {

            heirNode.setLeft(node.getLeft());

        }

        return heirNode;
    }

    @Override
    public Collection<V> values() {

        ArrayList<V> li = new ArrayList<>();
        addValue(root, li);
        return li;

    }

    private void addValue(Node<Entry<K, V>> child, ArrayList<V> li) {
        
        li.add(getValue(child));
        
        if (child.getLeft() != null)
            addValue(child.getLeft(), li);

        if (child.getRight() != null)
            addValue(child.getRight(), li);
    }

    @Override
    public Collection<Entry<K, V>> entrySet() {

        ArrayList<Entry<K, V>> li = new ArrayList<>();
        addEntry(root, li);
        return li;

    }

    private void addEntry(Node<Entry<K, V>> child, ArrayList<Entry<K, V>> li) {

        li.add(child.getValue());
        
        if (child.getLeft() != null)
            addEntry(child.getLeft(), li);

        if (child.getRight() != null)
            addEntry(child.getRight(), li);

    }

    @Override
    public Collection<K> keySet() {
        ArrayList<K> li = new ArrayList<>();
        rememberKey(root, li);
        return li;
    }

    private void rememberKey(Node<Entry<K, V>> child, ArrayList<K> li) {
        
        li.add(getKey(child));
        
        if (child.getLeft() != null) 
            rememberKey(child.getLeft(), li);
    
        if (child.getRight() != null) 
            rememberKey(child.getRight(), li);
        
    }

}