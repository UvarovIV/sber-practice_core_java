package Collections_part1;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(5);
        ll.addFirst(7);
        ll.addFirst(9);
        ll.addLast(3);
        ll.addLast(1);
        ll.addFirst(7);
        ll.addLast(1);
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }

        ll.addFirst(6);

        System.out.println();
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        System.out.println();
        System.out.println(ll.pollFirst());
        System.out.println(ll.pollLast());

        System.out.println();
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }

        System.out.println();
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        
        System.out.println();
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }

        System.out.println(ll.contains(9));
        System.out.println(ll.contains(3));
        System.out.println(ll.contains(5));
        System.out.println(ll.contains(7));
        System.out.println(ll.contains(0));

        System.out.println(ll.isEmpty());
        ll.clear();
        System.out.println(ll.isEmpty());
        System.out.println(ll.size());
    }
}
