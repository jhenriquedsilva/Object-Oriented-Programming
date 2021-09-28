package final_project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class LeitoraDeArquivoDeTexto {

    public static String[] geraArrayListComDados(String identificacao, String caminho) {
        try {
            FileReader leitor = new FileReader(caminho);
            BufferedReader bufferedReader = new BufferedReader(leitor);

            String linha;

            // Lê linha por linha para verificar o cadastro do cliente
            while ((linha = bufferedReader.readLine()) != null) {
                String[] dados = linha.split("|");
                if (dados[0].equals(caminho)) {
                    leitor.close();
                    return dados;
                }
            }
            // leitor.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
