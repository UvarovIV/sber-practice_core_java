package Collections_part2_and_Generics;

public class TestTreeMap {
    public static void main(String[] args) {
        
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        
        treeMap.put(10, "10");
        treeMap.put(7, "7");
        treeMap.put(12, "12");
        treeMap.put(6, "6");
        treeMap.put(8, "8");
        treeMap.put(11, "11");
        treeMap.put(13, "13");
        treeMap.put(5, "5");
        treeMap.put(14, "14");
        treeMap.put(9, "9");

        System.out.println("Вывод всех значений:");
        for (String el : treeMap.values())
            System.out.print(el + " ");
        System.out.println();

        System.out.println("Вывод всех ключей");
        for (Integer el : treeMap.keySet())
            System.out.print(el + " ");
        System.out.println();
        
        System.out.println("Вывод всех пар [ключ, значение]");
        for (var el : treeMap.entrySet())
            System.out.print(el + " ");
        System.out.println();
        
        System.out.println("В TreeMap есть 9: " + treeMap.containsKey(9));
        System.out.println("В TreeMap есть 150: " + treeMap.containsKey(150));

        System.out.println("Размер до удаления элементов: " + treeMap.size());
        System.out.println("Удалено: " + treeMap.remove(10));
        System.out.println("Удалено: " + treeMap.remove(12));
        System.out.println("Размер после удаления элементов: " + treeMap.size());

        System.out.println("Оставшиеся значения");

        for (String el : treeMap.values())
            System.out.print(el + " ");
        System.out.println();

        System.out.println("TreeMap пустой: " + treeMap.isEmpty());
        treeMap.clear();
        System.out.println("TreeMap пустой: " + treeMap.isEmpty());
    }
}