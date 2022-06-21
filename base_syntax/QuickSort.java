package base_syntax;

public class QuickSort {
    public static void quickSort(int[] arr, int begin, int end){

        int left = begin;
        int right = end;
        int middle_el = arr[(begin + end) / 2];

        if (arr.length == 0)
            return;

        if (begin >= end)
            return;

        while (left <= right){

            while(arr[left] < middle_el)
                left++;

            while(arr[right] > middle_el)
                right--;

            if (left <= right) {
                int buff = arr[left];
                arr[left] = arr[right];
                arr[right] = buff;
                left++;
                right--;
            }
        }
        
        if (begin < right)
            quickSort(arr, begin, right);

        if (end > left)
            quickSort(arr, left, end);
    }
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int left = 0; left < array.length; left++)
            array[left] = (int)(Math.random() * 10) + 1;

        for (int left = 0; left < array.length; left++)
            System.out.print(array[left] + " ");

        int begin = 0;
        int end = array.length - 1;
        quickSort(array, begin, end);

        System.out.println();

        for (int left = 0; left < array.length; left++)
            System.out.print(array[left] + " ");
            
    }
}
