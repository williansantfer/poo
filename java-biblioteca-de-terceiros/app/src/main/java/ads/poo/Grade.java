package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Grade {

    private double x;
    private double y;
    private double celula;
    private int linhas;
    private int colunas;
    private Color cor;

    public Grade(double x, double y, double celula, int linhas, int colunas, Color cor) {
        this.x = x;
        this.y = y;
        this.celula = celula;
        this.linhas = linhas;
        this.colunas = colunas;
        this.cor = cor;
    }

    public void desenhar(Draw draw) {
        // horizontais
        for (int i = 0; i < linhas; i++) {
            draw.line(x, y+(i*celula), x*celula*colunas, y+(i*celula));
        }

        for (int i = 0; i < colunas; i++) {

        }


    }

}
