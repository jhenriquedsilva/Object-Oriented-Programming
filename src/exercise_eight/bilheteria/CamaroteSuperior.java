package exercise_eight.bilheteria;

public class CamaroteSuperior extends VIP {

    private Double valorDoIngresso;

    public CamaroteSuperior(Double valorExtra) {
        super();
        this.valorDoIngresso = getValor() + getValorAdicional() + valorExtra;
    }

    public CamaroteSuperior() {
        super();
        this.valorDoIngresso = getValor() + getValorAdicional() + 100.0;
    }

    public Double getValorDoIngresso() {
        return valorDoIngresso;
    }

    public void setValorDoIngresso(Double valorDoIngresso) {
        this.valorDoIngresso = valorDoIngresso;
    }

}
