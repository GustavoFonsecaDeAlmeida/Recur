package grafos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Grafo {
    private int vertices;
    private int arestas;
    private HashMap<Integer, ArrayList<Integer>> adjacente;
    
    public Grafo(int v) {
        vertices = v;
        arestas = 0;
        adjacente = new HashMap<>();
        for (int i = 0; i < vertices; i++) {
            adjacente.put(i, new ArrayList<Integer>());
        }
    }
    
    public int getVertices() {
        return vertices;
    }
    
    public int getArestas() {
        return arestas;
    }
    
    public void criaAresta(int v1, int v2) {
        if ((v1 < 0) || (v1 >= vertices)) {
            throw new IndexOutOfBoundsException("Vertice fora da faixa");
        }
        if ((v1 < 0) || (v2 >= vertices)) {
            throw new IndexOutOfBoundsException("Vertice fora da faixa");
        }      
        arestas++;
        ArrayList vizinhos = adjacente.get(v1);
        vizinhos.add(v2);
        adjacente.put(v1, vizinhos);
        vizinhos = adjacente.get(v2);
        vizinhos.add(v1);
        adjacente.put(v2, vizinhos);
    }
    
    public void exibe() {
        StringBuilder saida = new StringBuilder();
        
        for (Map.Entry<Integer, ArrayList<Integer>> v : adjacente.entrySet())
            System.out.println(v);
    }
}