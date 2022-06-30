package Collections_part2_and_Generics;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        
        hashMap.put(10, "10");
        hashMap.put(7, "7");
        hashMap.put(12, "12");
        hashMap.put(6, "6");
        hashMap.put(8, "8");
        hashMap.put(11, "11");
        hashMap.put(13, "13");
        hashMap.put(5, "5");
        hashMap.put(14, "14");
        hashMap.put(9, "9");

        System.out.println("Вывод всех значений:");
        for (String el : hashMap.values())
            System.out.print(el + " ");
        System.out.println();

        System.out.println("Вывод всех ключей");
        for (Integer el : hashMap.keySet())
            System.out.print(el + " ");
        System.out.println();
        
        System.out.println("Вывод всех пар [ключ, значение]");
        for (var el : hashMap.entrySet())
            System.out.print(el + " ");
        System.out.println();
        
        System.out.println("В HashMap есть 9: " + hashMap.containsKey(9));
        System.out.println("В HashMap есть 150: " + hashMap.containsKey(150));

        System.out.println("Размер до удаления элементов: " + hashMap.size());
        System.out.println("Удалено: " + hashMap.remove(10));
        System.out.println("Удалено: " + hashMap.remove(12));
        System.out.println("Размер после удаления элементов: " + hashMap.size());

        System.out.println("Оставшиеся значения");

        for (String el : hashMap.values())
            System.out.print(el + " ");
        System.out.println();

        System.out.println("HashMap пустой: " + hashMap.isEmpty());
        hashMap.clear();
        System.out.println("HashMap пустой: " + hashMap.isEmpty());
    }
}
