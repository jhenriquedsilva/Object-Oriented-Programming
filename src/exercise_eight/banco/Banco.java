package exercise_eight.banco;

public class Banco {

    public static void main(String[] args) {
        Cliente ricardo = new Cliente("Ricardo Oliveira");
        ricardo.setConta(new ContaEspecial((float) 1000.0, (float) 1000.0));

        Cliente jose = new Cliente("José Silva");
        jose.setConta(new ContaEspecial((float) 0.0, (float) 0.0));

        System.out.printf("Saldo do Ricardo: %f%n",ricardo.getConta().getSaldo());
        ricardo.getConta().depositar((float) 500.0);
        System.out.printf("Saldo do Ricardo após depósito: %f%n",ricardo.getConta().getSaldo());
        ricardo.getConta().transferir(jose.getConta(), (float) 400.0);
        System.out.printf("Saldo na conta do Ricardo após transferência: %f%n",ricardo.getConta().getSaldo());
        System.out.printf("Saldo na conta do José após transferência: %f%n",jose.getConta().getSaldo());
        jose.getConta().sacar((float) 120.0);
        System.out.printf("Saldo do Ricardo após saque: %f%n",ricardo.getConta().getSaldo());
    }
}

// Output
/*
        Saldo do Ricardo: 1000,000000
        Saldo do Ricardo após depósito: 1500,000000
        Saldo na conta do Ricardo após transferência: 1100,000000
        Saldo na conta do José após transferência: 400,000000
        Saldo do Ricardo após saque: 1100,000000
*/
