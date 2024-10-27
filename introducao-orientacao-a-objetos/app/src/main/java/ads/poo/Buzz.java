package ads.poo;

import java.util.Random;

public class Buzz {

    private boolean capaceteAberto = false;
    private boolean asasAbertas = false;
    private String[] frases = {
            "Saudações, eu sou o Buzz Lightyear e venho em missão de paz.",
            "Ao infinito e além!",
            "Comando estelar pronto para voar!",
            "Isto não é voar. Isto é cair, com estilo!",
            "Preparado para voar!",
            "Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!"
    };

    public String falarFrase() {
        Random r = new Random();
        String frase = frases[r.nextInt(6)];
        return frase;
    }

    public String abrirFecharCapacete() {
        if (capaceteAberto) {
            capaceteAberto = false;
            return "Capacete fechado!";
        } else {
            capaceteAberto = true;
            return "Capacete aberto!";
        }
    }

    public boolean isCapaceteAberto() {
        return capaceteAberto;
    }

    public String abrirFecharAsas() {
        if (asasAbertas) {
            asasAbertas = false;
            return "Asas fechadas!";
        } else {
            asasAbertas = true;
            return "Asas abertas!";
        }
    }

    public boolean isAsasAbertas() {
        return asasAbertas;
    }

    public String dispararLaser() {
        return "Disparou Laser!";
    }

    public String golpearComBracoArticulado() {
        return "Golpeou com soco!";
    }

}
