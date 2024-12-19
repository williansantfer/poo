package ads.poo.produtos;

public class SemFIo extends Telefone {

    private double frequencia;
    private int quantidadeCanais;
    private double distancia;


    public SemFIo(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, double frequencia, int quantidadeCanais, double distancia) {
        super(codigo, numSerie, modelo, peso, dimensao);
        this.frequencia = frequencia;
        this.quantidadeCanais = quantidadeCanais;
        this.distancia = distancia;
    }

    @Override
    public String imprimirDados() {
        final StringBuilder sb = new StringBuilder("SemFIo{");
        sb.append(super.imprimirDados());
        sb.append("frequencia=").append(frequencia);
        sb.append(", quantidadeCanais=").append(quantidadeCanais);
        sb.append(", distancia=").append(distancia);
        sb.append('}');

        return sb.toString();
    }
}
