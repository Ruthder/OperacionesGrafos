
package operaciones_grafos_anaarias_ruthdercantillo;

import java.util.ArrayList;

public class Vertice {
    int num, x, y;
    boolean visitado;
    ArrayList<Vertice> vecinos;
    
    public Vertice(int num, int x, int y) {
        this.num = num;
        this.x = x;
        this.y = y;
        vecinos = new ArrayList<>();
        visitado = false;
    }
    
}
