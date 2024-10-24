package ads.poo;

public class Caneta {

    private String cor;
    private int nivelTinta;

    public void definirCor(String c) {
        cor = c;
    }

    public String obterCor() {
        return cor;
    }

    public void definirNivelTinta(int n) {
        nivelTinta = n;
    }

    public int obterNivelTinta() {
        return nivelTinta;
    }

    public String desenhar(int distancia) {

        if (distancia > nivelTinta) {
            return "Nível de tinta insuficiente!";
        } else if (distancia < 0) {
            return "Valor inválido!";
        } else {
            nivelTinta = nivelTinta - distancia;
            return "Desenhando " + distancia + "cm na cor " + cor + ".";
        }
    }
}
