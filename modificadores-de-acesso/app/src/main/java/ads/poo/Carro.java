package ads.poo;

public class Carro {

    private String modelo;
    private String cor;
    private int velocidadeAtual;
    private final int VELOCIDADE_MAXIMA = 200; // constante
    private double preco;

    public int obterVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public void acelerar(int valor) {
        if (velocidadeAtual + valor <= VELOCIDADE_MAXIMA) {
            this.velocidadeAtual += valor;
        } else {
            this.velocidadeAtual = VELOCIDADE_MAXIMA;
        }
    }

    public void frear(int valor) {
        if (velocidadeAtual - valor >= 0) {
            this.velocidadeAtual -= valor;
        } else {
            this.velocidadeAtual = 0;
        }
    }
}
