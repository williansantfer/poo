package ads.poo;

import java.util.Random;

public class Buzz {

    private boolean capaceteAberto;
    private boolean asasAbertas;
    private String[] frases = {
            "Ao infinito e além!",
            "Isto não é voar. Isto é cair, com estilo!",
            "Você só tem que explodir as malditas portas.",
            "Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!",
            "frase",
            "frase"
    };

    public String falarFrase(int n) {
        Random r = new Random();
        String frase = frases[r.nextInt(6)];
        return frase;
    }

    public String abrirCapacete() {
        capaceteAberto = true;
        return "Capacete aberto...";
    }

    public String fecharCapacete() {
        capaceteAberto = false;
        return "Capacete fechado...";
    }

    public String abrirAsas() {
        asasAbertas = true;
        return "Asas abertas...";
    }

    public String fecharAsas() {
        asasAbertas = false;
        return "Asas fechadas";
    }

    public String dispararLaser() {
        return "Disparou Laser...";
    }

    public String golpearComBracoArticulado() {
        return "Deu um soco...";
    }

}
