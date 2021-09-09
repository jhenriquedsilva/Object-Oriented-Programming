package exercise_eight.bilheteria;

public class VIP extends Ingresso {

    private Double valorAdicional;

    public VIP(Double valorBase, Double valorAdicional) {
        super(valorBase);
        this.valorAdicional = valorAdicional;
    }

    public VIP(Double valorAdicional) {
        super();
        this.valorAdicional = valorAdicional;
    }

    public VIP() {
        super();
        this.valorAdicional = 100.0;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public Double valorDoIngresso() {
        return getValor() + getValorAdicional();
    }
}
