
import java.util.List;

public class Ordenar {

    public void ordenar(List<Pais> paises) {
        paises.sort((p1, p2) -> Double.compare(p1.getVinho(), p2.getVinho()));
    }
    



    
}
