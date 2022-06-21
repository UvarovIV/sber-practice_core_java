package base_syntax;

public class Task5 {
    public static void primes(int num){
        for (int i = 2; i < num; i++) 
            if (num % i == 0)
                return;
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        for (int i = 2; i < 101; i++)
            primes(i);
    }
}
