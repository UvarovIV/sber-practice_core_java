package Collections_part1;

public class TestArrayList {
    public static void main(String[] args) {

    ArrayList ll = new ArrayList();

    try {
        ll.add(0);
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(0, 12);
        ll.add(ll.size(), 10);
        ll.add(3, 15);
        ll.add(6, 15);
        ll.add(7, 15);

        System.out.println("\nTest add");
        for (var item : ll) 
            System.out.print(item + " ");

        ArrayList sublist = ll.subList(3, 6); 

        System.out.println("\n\nTest sublist from 3 to 6");
        for (var item : sublist) 
            System.out.print(item + " ");

        System.out.println("\n\nTest get");
        System.out.println("Element with index 3: " + ll.get(3));

        System.out.println("\nTest indexOf");
        System.out.println("First Index of 15: " + ll.indexOf(15));
        System.out.println("Last Index of 15: " + ll.lastIndexOf(15));

        System.out.println("\nTest remove");
        System.out.println("Remove element with index 4: " + ll.remove(4));
        System.out.println("Remove element 15: " + ll.remove((Object) 15));
        
        System.out.println("\nAfter removing elements");
        for (var item : ll) 
            System.out.print(item + " ");

        System.out.println("\n\nTest set");
        ll.set(0, 1);
        ll.set(ll.size()-1, 1);
        for (var item : ll) 
            System.out.print(item + " ");

        System.out.println("\n\nArray list contains 9: " + ll.contains(9));
        System.out.println("Array list contains 3: " + ll.contains(3));
        System.out.println("Array list contains 1: " + ll.contains(1));
        System.out.println("Array list contains 15: " + ll.contains(15));
        
        System.out.println("\nArray list is empty: " + ll.isEmpty());
        ll.clear();
        System.out.println("Array list is empty: " + ll.isEmpty());

        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } 
    }
}
