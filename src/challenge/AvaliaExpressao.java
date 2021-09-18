package challenge;

import java.util.EmptyStackException;
import java.util.Stack;

// Esta classe tem por objetivo calcular e retornar
// o resultado da expressão de cada linha do arquivo de texto
public class AvaliaExpressao {

    public static String avalia(String expressao) {

        // Cada caractere da linha
        char[] caracteres = expressao.toCharArray();

        // Stack for numbers
        Stack<Double> numeros = new Stack<Double>();

        //Stack for operators
        Stack<Character> operadores = new Stack<Character>();

        for (int i = 0; i < caracteres.length; i++) {

            // Se o caractere atual é um número, pule-o
            if (caracteres[i] == ' ') { continue; }

            // Se o caractere atual é um número, colocá-lo dentro
            // da pilha para os números
            if (caracteres[i] >= '0' && caracteres[i] <= '9') {

                // Números que tem mais de um dígito devem ser colocados
                // de uma vez só na pilha de números
                StringBuffer stringBuffer = new StringBuffer();

                // O número pode ter mais que um dígito
                while (i < caracteres.length && caracteres[i] >= '0' && caracteres[i] <= '9') {
                    stringBuffer.append(caracteres[i++]); // Primeiro adiciona, depois incrementa
                }
                // O conteúdo do stringBuffer é adicionado na pilha.
                numeros.push(Double.parseDouble(stringBuffer.toString()));
                // Como o loop while acima incrementou o índice para satisfazer
                // suas necessidades, é necessário decrementar em 1 unidade, pois o
                // loop for já fará este incremento.
                i--;


                // Se o caractere atual for a abertura de parênteses,
                // adiciona-a na pilha de operadores
            } else if (caracteres[i] == '(') {
                operadores.push(caracteres[i]);

                // Se o caractere atual for o fechamento de parênteses,
                // resolve-se a expressão dentro deles
            } else if (caracteres[i] == ')') {

                while (operadores.peek() != '(') {
                    numeros.push(applyOp(operadores.pop(), numeros.pop(), numeros.pop()));
                }
                operadores.pop();


                // Caractere atual é um operador
            } else if (caracteres[i] == '+' || caracteres[i] == '-' || caracteres[i] == '*' || caracteres[i] == '/' || caracteres[i] == '^') {

                // Enquanto o operador que está no topo da pilha dos operadores
                // tem a mesma ou uma maior precedência em relação ao
                // caractere atual, que é um operador, aplica-se o operador no
                // no topo da pilha dos operadores ao dois elementos que estão
                // no topo da pilha dos números
                while (!operadores.empty() && hasPrecedence(caracteres[i], operadores.peek())) {
                    try {
                        numeros.push(applyOp(operadores.pop(), numeros.pop(), numeros.pop()));

                    // Quando o código tentar tirar caracteres da pilha de
                    // operadores sendo que não há mais nenhum, significa
                    // que os operadores estão desbalanceados em relação aos
                    // números, ou seja, houve um erro de sintaxe
                    // Sendo assim, basta retornar o mensagem pedida pelo desafio.
                    } catch(EmptyStackException e) {
                        return "ERR SYNTAX";
                    }
                }
                // Colocar caractere atual na pilha dos operadores
                operadores.push(caracteres[i]);
            }
        }

        // A expressao inteira já foi anailsada
        // neste ponto. Aplica-se as operações
        // restantes aos números restantes
        while (!operadores.empty()) {
            try {
                numeros.push(applyOp(operadores.pop(), numeros.pop(), numeros.pop()));

                // Quando o código tentar tirar caracteres da pilha de
                // operadores sendo que não há mais nenhum, significa
                // que os operadores estão desbalanceados em relação aos
                // números, ou seja, houve um erro de sintaxe
                // Sendo assim, basta retornar o mensagem pedida pelo desafio.
            } catch (EmptyStackException e) {
                return "ERR SYNTAX";

                // Quando uma divisão por zero for acontecer,
                // o método applyOp jogaŕa esta exceção.
                // Sendo assim, é suficiente retornar a mensagem
                // pedida pelo desafio.
            } catch (UnsupportedOperationException e) {
                return "ERR DIVBYZERO";
            }
        }
        // O elemento que está no topo da pilha
        // dos números representa o resultádo da
        // expressão. Então, é só retorná-lo.
        return numeros.pop().toString();
    }

    // Retorna true se o operador 2 tem maior
    // ou mesma precedência em relaçõo ao operador 1.
    // Caso contrário, retorna false
    public static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        }
        if ((op1 == '^') && (op2 == '*' || op2 == '/')) {
            return false;
        }
        if ((op1 == '^') && (op2 == '+' || op2 == '-')) {
            return false;
        } else {
            return true;
        }
    }

    // Um método para aplicar uma das operações
    // em dois operandos e retorna o resultado.
    public static double applyOp(char op, double b, double a) throws UnsupportedOperationException {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    // Se houver uma divisão por zero,
                    // lançar esta exceção.
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                return a / b;
            case '^':
                return Math.pow(a, b);
        }
        return 0;
    }

}

