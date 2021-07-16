package exercise_one;

public class Principal {

    // Questão 3
    public static void compara(int a, int b) {
        if (a > b) {
            System.out.println(a + " é o maior");
        } else {
            System.out.println(b + " é o maior");
        }
    }

    // Questão 4
    public static void imprimeNaturaisMenores(int a) {
        while (a >= 0) {
            System.out.print(a + " ");
            a--;
        }
    }

    // Questão 5
    public static void imprimeSomaDosImparesESomaDosPares() {
        int numero = 2;
        Long multiplicacaoPares = 1l;
        int somaImpares = 1;
        System.out.println("\n");
        while (numero <= 30) {
            if (numero % 2 == 0) {
                multiplicacaoPares *= numero;
                numero++;
            } else {
                somaImpares += numero;
                numero++;
            }
        }
        System.out.println("Soma dos ímpares é igual a "+somaImpares);
        System.out.println("Multiplicação dos pares é igual a "+multiplicacaoPares);
    }

    public static void main(String args[]) {
        // Questão 3
        System.out.println("Questão 3");
        compara(10, 3);

        // Questão 4
        System.out.println("\nQuestão 4");
        imprimeNaturaisMenores(10);

        // Questão 5
        System.out.println("\nQuestão 5");
        imprimeSomaDosImparesESomaDosPares();

        // Questão 6
        System.out.println("\nQuestão 6");
        System.out.println("Troca com variável auxiliar");
        int a = 4;
        int b = 8;
        System.out.println("Antes da troca: a = "+a+", b = "+b);
        int aux = a;
        a = b;
        b = aux;
        System.out.println("Depois da troca: a = "+a+", b = "+b);

        System.out.println("\nTroca sem variável auxiliar");
        a = 24;
        b = 32;
        System.out.println("Antes da troca: a = "+a+", b = "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Depois da troca: a = "+a+", b = "+b);

        // Questão 7
        System.out.println("\nQuestão 7");
        // Agenda é criada
        Agenda agenda = new Agenda();
        // Dois contatos são adicionados à agenda
        agenda.adicionarContato(new Contato("Henrique", "josehs555@gmail.com"));
        agenda.adicionarContato(new Contato("Lauriany", "laurianylaureiro@gmail.com"));
        System.out.println("\nNúmero de contatos na agenda após dois serem adicionados");
        System.out.println(agenda.contarNumeroContatos());
        // Excluindo um contato da agenda
        System.out.println("\nNúmero de contatos na agenda após um ser removido");
        agenda.excluirContato("Henrique");
        System.out.println(agenda.contarNumeroContatos());
        // Buscando um contato na agenda
        System.out.println("\nBuscando um contato na agenda");
        agenda.buscarContato("Lauriany");

    }
}
