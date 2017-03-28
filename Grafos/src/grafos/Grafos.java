package grafos;

public class Grafos {
    public static void main(String[] args) {
        Grafo grafo = new Grafo(4);
        
        grafo.criaAresta(0, 1);
        grafo.criaAresta(0, 2);
        grafo.criaAresta(0, 3);
        grafo.criaAresta(1, 2);
        grafo.criaAresta(2, 3);
        
        grafo.exibe();
    }
}
