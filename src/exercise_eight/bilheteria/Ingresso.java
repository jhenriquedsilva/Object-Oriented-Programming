package exercise_eight.bilheteria;

public class Ingresso {

    private Double valor;

    public Ingresso(Double valor) {
        this.valor = valor;
    }

    public Ingresso() {
        this.valor = 100.0;
    }

    public void imprimeValor() {
        System.out.printf("O valor do seu ingresso é %2f%n",valor);
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
