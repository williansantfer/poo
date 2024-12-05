package ads.poo;

public class Email {

    private String rotulo;
    private String valor;

    //String eR = "^[\\W-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

    public Email(String rotulo, String valor) {
        this.rotulo = rotulo;
        this.valor = this.setValor(valor);
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public String getValor() {
        return valor;
    }

    public String setValor(String valor) {

        String eR = "^[\\W-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

        if (valor.matches(eR)) {
             return this.valor = valor;
        } else {
            return this.valor = null;
        }
    }

    @Override
    public String toString() {
        return rotulo + ": " + this.getValor();
    }
}
