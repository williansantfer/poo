package ads.poo;

public class Carro {

    // atributos
    private String modelo;
    private int velocidadeAtual;
    private String cor;

    // métodos
    public void definirModelo(String m) {
        modelo = m;
    }

    public String obterModelo() {
        return modelo;
    }

    public void definirVelocidade(int v) {
        velocidadeAtual = v;
    }

    public int obterVelocidade() {
        return velocidadeAtual;
    }

    public void definirCor(String c) {
        cor = c;
    }

    public String obterCor() {
        return cor;
    }


}
