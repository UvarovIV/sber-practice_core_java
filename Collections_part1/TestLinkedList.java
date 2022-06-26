package Collections_part1;



public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(3);
        ll.addLast(1);
        ll.addLast(1);
        ll.addFirst(5);
        ll.addFirst(7);
        ll.addFirst(9);
        ll.add(0, 12);
        ll.add(ll.size(), 10);
        ll.add(3, 15);
        System.out.println("Size: " + ll.size());

        for (var item : ll) 
            System.out.println(item);

        LinkedList sublist = ll.subList(0, 9); 
        System.out.println("Size: " + ll.size());

        System.out.println();

        for (var item : sublist) 
            System.out.println(item);

        System.out.println();
        System.out.println("First Element: " + ll.getFirst());
        System.out.println("Last Element: " + ll.getLast());
        System.out.println("Size: " + ll.size());

        System.out.println();

        System.out.println("First Element deleted: " + ll.pollFirst());
        System.out.println("Last Element deleted: " + ll.pollLast());
        System.out.println("Size: " + ll.size());
        System.out.println("First Element deleted: " + ll.pollFirst());
        System.out.println("Last Element deleted: " + ll.pollLast());
        System.out.println("Size: " + ll.size());

        System.out.println();

        for (var item : ll) 
            System.out.println(item);

        System.out.println();

        System.out.println("First Element deleted: " + ll.removeFirst());
        System.out.println("Last Element deleted: " + ll.removeLast());
        System.out.println("Size: " + ll.size());
        
        System.out.println();
        for (var item : ll) 
            System.out.println(item);

        System.out.println(ll.contains(9));
        System.out.println(ll.contains(3));
        System.out.println(ll.contains(5));
        System.out.println(ll.contains(7));
        System.out.println(ll.contains(0));
        System.out.println("Size: " + ll.size());
        
        System.out.println(ll.isEmpty());
        ll.clear();
        System.out.println(ll.isEmpty());
        System.out.println(ll.size());
    }
}
