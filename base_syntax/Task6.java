package base_syntax;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество звездочек в ряду");
        int horizontal = in.nextInt();
        System.out.println("Введите количество рядов");
        int vertical = in.nextInt();
        in.close();

        for (int i = 0; i < vertical; i++) {
            for (int j = 0; j < horizontal-1; j++) 
                System.out.print("* ");
            System.out.println("*");
        }
    }
}
