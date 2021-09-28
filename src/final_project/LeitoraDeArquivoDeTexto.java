package final_project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;;

public class LeitoraDeArquivoDeTexto {

    private static LeitoraDeArquivoDeTexto leitora;

    private LeitoraDeArquivoDeTexto() {}

    public static LeitoraDeArquivoDeTexto instancia() {
        if (leitora == null) {
            leitora = new LeitoraDeArquivoDeTexto();
        }
        return leitora;
    }

    public String[] geraArrayListComDados(String identificacao, String caminho) {
        try {
            FileReader leitor = new FileReader(caminho);
            BufferedReader bufferedReader = new BufferedReader(leitor);

            String linha;

            // Lê linha por linha para verificar o cadastro do cliente
            while ((linha = bufferedReader.readLine()) != null) {
                String[] dados = linha.split("|");
                if (dados[0].equals(caminho)) {
                    leitor.close();
                    bufferedReader.close();
                    return dados;
                }
            }
            leitor.close();
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
