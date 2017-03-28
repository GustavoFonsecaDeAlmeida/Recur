package recursividade.fib2;

import java.util.Scanner;

public class RecursividadeFib2 {
    
    public static int fib(int n) {

        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }
    
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Entre com um número: ");
        num = teclado.nextInt();
        System.out.printf("Fibonacci de %d é %d\n", num, fib(num));
    }
}