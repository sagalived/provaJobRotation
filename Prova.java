package provaJobRotation;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
   
        
        System.out.print("Digite um número: ");
        int num = Scanner.nextInt();

        boolean pertence = false;
        int a = 0, b = 1, c = 0;
        while (c <= num) {
            if (c == num) {
                pertence = true;
                break;
            }
            c = a + b;
            a = b;
            b = c;
        }

        if (pertence) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }
}
