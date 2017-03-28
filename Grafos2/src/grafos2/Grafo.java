package grafos2;

class Vizinho {
    int vertice;
    Vizinho proximo;
    
    public Vizinho(int v, Vizinho p) {
        vertice = v;
        proximo = p;
    }
}

class Vertice {
    int vertice;
    Vizinho lista;
    
    public Vertice(int v, Vizinho l) {
        vertice = v;
        lista = l;
    }
}

public class Grafo {
    Vertice[] grafo;
    
    public Grafo(int numVertices) {
        grafo = new Vertice[numVertices];
    }
    
    public void criaVertice(int v) {
        grafo[v] = new Vertice(v, null);
    }
    
    public void criaAresta(int v1, int v2) {
        grafo[v1].lista = new Vizinho(v2, grafo[v1].lista);
        grafo[v2].lista = new Vizinho(v1, grafo[v2].lista);
    }
    
    public String toString() {
        String ret = "";
        
        for (int v = 0; v < grafo.length; v++) {
            ret += "Vertice " + v + ": ";
            Vizinho tmp = grafo[v].lista;
            while (tmp != null) {
                ret += grafo[tmp.vertice].vertice + " ";
                tmp = tmp.proximo;
            }
            ret +=  "\n";
        }
        return ret;
    }
}