package exercise_eight.banco;

public class ContaEspecial extends ContaCorrente {

    private float limite;

    public ContaEspecial(float saldo, float limite) {
        super(saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return this.limite;
    }

    @Override
    public boolean sacar(float valor) {
        if (saldo > limite && (saldo - valor) >= limite) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Você não possui saldo suficiente ou seu limite de crédito está esgotado");
            return false;
        }
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}
