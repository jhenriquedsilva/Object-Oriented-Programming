package challenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Esta classe responsavel por ler o arquivo de texto
// linha por linha e passa-la para
public class LerArquivoTexto {

    public static void main(String args[]) throws IOException {

        // Objeto arquivo e criado
        File arquivo = new File("src/d14.txt");

        // Buffered sera utilizado para ler linha por linha
        BufferedReader br = new BufferedReader(new FileReader(arquivo));

        // Esta variavel guardara cada linha, que e uma expressão
        String expressao;

        // O arquivo e lido nquanto houver linha para serem lidas
        while((expressao = br.readLine()) != null) {
            // O resultado da expressão é retornado na forma de String
            String resultado = AvaliaExpressao.avalia(expressao);

            // O resultado da expressão é transformado em inteiro e imprimido
            try {
                System.out.println((int) Double.parseDouble(resultado));

            // Quando o resultado não pode ser convertido para inteiro,
            // significa que resultado é igual a ERR DIVBYZERO ou ERR SYNTAX.
            // Sendo assim, é suficiente que o resultado seja imprimido.
            } catch (Exception e) {
                System.out.println(resultado);
            }
        }
    }
}
