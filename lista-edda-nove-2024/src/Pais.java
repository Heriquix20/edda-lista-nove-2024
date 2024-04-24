public class Pais {


    public Pais() {
    }
    private String nome;
    private double cerveja;
    private double bebidaReligiosa;
    private double vinho;

    @Override
    public String toString() {
        return "País que mais consome vinho: " + this.getNome() + "\n Quantidade: " + this.getVinho() + "\n\n";
                
    }

    public Pais(String nome, double cerveja, double bebidaReligiosa, double vinho) {
        this.nome = nome;
        this.cerveja = cerveja;
        this.bebidaReligiosa = bebidaReligiosa;
        this.vinho = vinho;
    }

    
    public String getNome() {
        return nome;
    }
    public double getCerveja() {
        return cerveja;
    }
    public double getBebidaReligiosa() {
        return bebidaReligiosa;
    }
    public double getVinho() {
        return vinho;
    }
    
}
