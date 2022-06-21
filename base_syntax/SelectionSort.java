package base_syntax;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++)
            array[i] = (int)(Math.random() * 10) + 1;

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        for (int i = 0; i < array.length - 1; i++)
            for (int j = i + 1; j < array.length; j++) 
                if (array[i] > array[j]){
                    int buff = array[i];
                    array[i] = array[j];
                    array[j] = buff;
                }
        
        System.out.println();

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
            
    }
}
