package recursividade.fatorial1;

import java.util.Scanner;

public class RecursividadeFatorial1 {
    
    public static int fat(int n) {
        int result = 1;
        
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Entre com um número: ");
        num = teclado.nextInt();
        System.out.printf("Fatorial de %d é %d\n", num, fat(num));
    }
}
