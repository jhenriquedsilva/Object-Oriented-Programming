package exercise_eight.bilheteria;

import java.util.Scanner;

public class Bilheteria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer decisao;
        System.out.println("Vamos iniciar a compra do seu ingresso!");

        do {
            System.out.println("Você deseja um ingressso normal[1] ou VIP[2]?");
            decisao = Integer.parseInt(sc.nextLine());
        } while(decisao != 1 && decisao != 2);

        if (decisao == 1) {
            System.out.println("Perfeito, você escolheu um  ingresso normal!");
            Normal n = new Normal();
            n.imprimeValor();
        } else {
            System.out.println("Perfeito, você escolheu um ingresso VIP.");

            decisao = null;
            do {
                System.out.println("Agora, preciso saber se você deseja um ingresso para o camarote superior[1] ou inferior[2].");
                decisao = Integer.parseInt(sc.nextLine());
            } while(decisao != 1 && decisao != 2);

            if (decisao == 1) {
                CamaroteSuperior cs = new CamaroteSuperior();
                System.out.printf("O valor do seu ingresso é %2f",cs.getValorDoIngresso());
            } else {
                CamaroteInferior ci = new CamaroteInferior(10,'J');
                System.out.printf("O valor do seu ingresso é %2f",ci.valorDoIngresso());
            }
        }
    }
}
// Exemplo de execução
/**
 * Vamos iniciar a compra do seu ingresso!
 * Você deseja um ingressso normal[1] ou VIP[2]?
 * 2
 * Perfeito, você escolheu um ingresso VIP.
 * Agora, preciso saber se você deseja um ingresso para o camarote superior[1] ou inferior[2].
 * 2
 * O valor do seu ingresso é 200,000000
 */
