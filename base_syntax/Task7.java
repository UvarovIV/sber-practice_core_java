package base_syntax;

public class Task7 {

    public static void fibonacciNumbers(int n1, int n2, int i){
        if (i == 11)
            return;
        i++;
        int n3 = n2 + n1;
        System.out.print(n3 + " ");
        fibonacciNumbers(n2, n3, i);
        
    }
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1; 
        System.out.print(num1 + " " + num2 + " ");
        fibonacciNumbers(num1, num2, 2);
    }
}
