
package operaciones_grafos_anaarias_ruthdercantillo;

import java.util.ArrayList;

public class Grafo {
    ArrayList<Vertice> vertices;

    public Grafo() {
        vertices = new ArrayList<>();
    }

    public void InsertarVertice(Vertice vertice) {
        this.vertices.add(vertice);
    }

    public ArrayList<Vertice> getVertices() {
        return vertices;
    }
    
    public Vertice getVerticeIndicado(int num){
        for (Vertice vertice : vertices) {
            if(vertice.num == num){
                return vertice;
            }
        }
        return null;
    }   
}
