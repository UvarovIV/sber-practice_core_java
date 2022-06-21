package base_syntax;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 99) + 2;

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        
        int max = array[0];
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            if(array[i] > max)
                max = array[i];
            sum += array[i];
        }
        
        System.out.println();
        System.out.println("Максимальное значение в массиве " + max);
        System.out.println("Среднее значение " + (double) sum / array.length);
            
    }
}
