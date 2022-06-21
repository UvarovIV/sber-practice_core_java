package base_syntax;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++)
            array[i] = (int)(Math.random() * 10) + 1;

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - i - 1; j++) 
                if (array[j] > array[j + 1]){
                    int buff = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buff;
                }
        
        System.out.println();

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
            
    }
}
