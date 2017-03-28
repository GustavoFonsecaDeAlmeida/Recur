package recursividade.fib1;

import java.util.Scanner;

public class RecursividadeFib1 {
    
    public static int fib(int n) {
        int i, n1 = 0, n2 = 1, n3 = 0;

        for (i = 2; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }
    
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Entre com um número: ");
        num = teclado.nextInt();
        System.out.printf("Fibonacci de %d é %d\n", num, fib(num));
    }
}
