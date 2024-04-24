import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
public class LerArquivo {
    

    public void lerArquivo(List<Pais> paises) {
        try {
            File file = new File("C:\\Users\\aluno\\Downloads\\drinks.csv");
            BufferedReader buff = new BufferedReader(new FileReader(file));
            buff.readLine();
            String linha = buff.readLine();

            while (linha != null) {
                String dadosDrinks[] = linha.split(",");

                String nome = dadosDrinks[0];
                double beer = Double.parseDouble(dadosDrinks[1]);
                double spirit = Double.parseDouble(dadosDrinks[2]);
                double wine = Double.parseDouble(dadosDrinks[3]);

                Pais pais = new Pais(nome, beer, spirit, wine);
                paises.add(pais);

                linha = buff.readLine();
            }
            buff.close();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro na leitura do arquivo");
        }
    }

    
}
