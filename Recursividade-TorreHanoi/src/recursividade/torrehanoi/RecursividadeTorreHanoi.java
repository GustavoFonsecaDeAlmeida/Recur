package recursividade.torrehanoi;

import java.util.Scanner;

public class RecursividadeTorreHanoi {

    public static void torres(int n, char de, char para, char aux) {

        // Se houver um disco, move e retorna
        if (n == 1) {
            System.out.printf("\nMove o disco 1 de %c para %c", de, para);
            return;
        }
        //Move n-1 discos de A para B, utilizando C como auxiliar
        torres(n-1, de, aux, para);
        // Move os discos restantes de A para C
        System.out.printf("\nMove o disco %d de %c para %c", n, de, para);
        // Move n-1 discos de B para C utilizando A como auxiliar
        torres(n-1, aux, para, de);
    }

    public static void main(String[] args) {
        int n;
        Scanner teclado = new Scanner(System.in);

	System.out.print("Entre com o numero de discos: ");
	n = teclado.nextInt();
	torres(n, 'A', 'C', 'B');
	System.out.println();
    }
}