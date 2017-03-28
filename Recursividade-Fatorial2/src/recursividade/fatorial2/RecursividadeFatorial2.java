package recursividade.fatorial2;

import java.util.Scanner;

public class RecursividadeFatorial2 {
    
    public static int fat(int n) {
        
        if (n == 0) {
            return 1;
        }
        else {
            return n * fat(n - 1);
        }
    }
    
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Entre com um número: ");
        num = teclado.nextInt();
        System.out.printf("Fatorial de %d é %d\n", num, fat(num));
    }
}