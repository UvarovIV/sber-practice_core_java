package base_syntax;

public class Task4 {
    public static void main(String[] args) {
        double[] array = new double[10];

        for (int i = 0; i < array.length; i++)
            array[i] = Math.random();

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        
        double max = array[0];
        double sum = 0;

        for (int i = 0; i < array.length; i++){
            if(array[i] > max)
                max = array[i];
            sum += array[i];
        }
        
        System.out.println();
        System.out.println("Максимальное значение в массиве " + max);
        System.out.println("Среднее значение " + sum / array.length);
            
    }
}
