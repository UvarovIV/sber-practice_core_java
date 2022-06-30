package Collections_part1_and_Generics;

import java.util.NoSuchElementException;

public class TestLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        try{
        ll.addLast(3);
        ll.addLast(1);
        ll.addLast(1);
        ll.addFirst(5);
        ll.addFirst(7);
        ll.addFirst(9);
        ll.add(0, 12);
        ll.add(ll.size(), 10);
        ll.add(3, 15);
        ll.add(2);

        System.out.println("\nTest add");
        for (var item : ll) 
            System.out.print(item + " ");

        LinkedList<Integer> sublist = ll.subList(3, 6); 

        System.out.println("\n\nTest sublist from 3 to 6");
        for (var item : sublist) 
            System.out.print(item + " ");

        System.out.println("\n\nTest get");
        System.out.println("First Element: " + ll.getFirst());
        System.out.println("Last Element: " + ll.getLast());
        System.out.println("Element with index 3: " + ll.get(3));

        System.out.println("\nTest indexOf");
        System.out.println("First Index of 1: " + ll.indexOf(1));
        System.out.println("Last Index of 1: " + ll.lastIndexOf(1));

        System.out.println("\nTest poll");
        System.out.println("First Element deleted: " + ll.pollFirst());
        System.out.println("Last Element deleted: " + ll.pollLast());

        System.out.println("\nTest remove");
        System.out.println("First Element deleted: " + ll.removeFirst());
        System.out.println("Last Element deleted: " + ll.removeLast());
        System.out.println("Remove element with index 4: " + ll.remove(4));
        System.out.println("Remove element 1: " + ll.remove((Integer) 1 ));
        
        System.out.println("\nAfter removing elements");
        for (var item : ll) 
            System.out.print(item + " ");

        System.out.println("\n\nTest set");
        ll.set(0, 1);
        for (var item : ll) 
            System.out.print(item + " ");

        System.out.println("\n\nLinked list contains 9: " + ll.contains(9));
        System.out.println("Linked list contains 3: " + ll.contains(3));
        System.out.println("Linked list contains 1: " + ll.contains(1));
        System.out.println("Linked list contains 0: " + ll.contains(0));
        
        System.out.println("\nLinked list is empty: " + ll.isEmpty());
        ll.clear();
        System.out.println("Linked list is empty: " + ll.isEmpty());
        
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NoSuchElementException ex) {
            ex.printStackTrace();
        }

    }
}
