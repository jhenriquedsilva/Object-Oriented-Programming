package exercise_eight.banco;

public class ContaCorrente {

    protected float saldo;

    public ContaCorrente(){
        this.saldo = (float) 0.0;
    }

    public ContaCorrente(float valor) {
        this.saldo = valor;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public boolean sacar(float valor) {
        if (valor < this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }

    /*
    public boolean transferir(ContaCorrente conta) {
        // TODO
    }
    */

    public float getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "saldo=" + saldo +
                '}';
    }
}
