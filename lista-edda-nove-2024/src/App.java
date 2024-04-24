import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Pais> paises = new ArrayList<>();
        Pais pais = new Pais();
        LerArquivo read = new LerArquivo();
        Ordenar organizar = new Ordenar();

        read.lerArquivo(paises);
        organizar.ordenar(paises);
        

        for (Pais p : paises) {
            System.out.println(p);
        }


    }
}
