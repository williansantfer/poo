package ads.poo;

public class Carro {

    private String modelo;
    private int velocidadeAtual;
    private int VELOCIDADE_MAXIMA = 200;

    public Carro(String modelo, int velocidadeAtual, int VELOCIDADE_MAXIMA) {
        this.modelo = modelo;
        this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
        this.velocidadeAtual = 0;
        this.acelerar(velocidadeAtual);
    }

    public int obterVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public void acelerar(int valor) {

        this.velocidadeAtual = Math.max(Math.min(VELOCIDADE_MAXIMA, this.velocidadeAtual + valor), 0);

    }

    public void frear(int valor) {
        if (velocidadeAtual - valor >= 0) {
            this.velocidadeAtual -= valor;
        } else {
            this.velocidadeAtual = 0;
        }
    }
}
