package grafos2;

public class Grafos2 {
    public static void main(String[] args) {
        final int NUMVERTICES = 4;
        Grafo grafo = new Grafo(NUMVERTICES);
        
        for (int i = 0; i < NUMVERTICES; i++) {
            grafo.criaVertice(i);
        }
        
        grafo.criaAresta(0, 1);
        grafo.criaAresta(0, 2);
        grafo.criaAresta(0, 3);
        grafo.criaAresta(1, 2);
        grafo.criaAresta(2, 3);
        
        System.out.println(grafo.toString());
    }
}
