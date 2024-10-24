package ads.poo;

public class Contador {

    private int valorAtual;

    public int obterValorAtual() {
        return valorAtual;
    }

    public void definirValorContador(int v) {
        valorAtual = v;
    }

    public void incrementarContador() {
        valorAtual++;
    }

}
