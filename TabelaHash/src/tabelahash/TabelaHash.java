package tabelahash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TabelaHash {
    public static void main(String[] args) {
        HashMap<String, Integer> notas = new HashMap<String, Integer>();
        Scanner teclado = new Scanner(System.in);
        
        notas.put("Luiz", 5);
        notas.put("Maria", 7);
        notas.put("Felipe", 6);
        notas.put("Luiza", 8);

        for (Map.Entry<String, Integer> chave : notas.entrySet()) {
            String nome = chave.getKey();
            int nota = chave.getValue();
            System.out.println("Chave: " + nome + " Nota: " + nota);
        }
        
        System.out.print("Entre com a chave: ");
        String chave = teclado.nextLine();
        if (notas.containsKey(chave)) {
            System.out.println("Chave: " + chave + " Nota: " + notas.get(chave));
        }
        else {
            System.out.println("Chave não encontrada");
        }
        
        System.out.println("Removeu a nota: " + notas.remove("Luiz"));
    }
}