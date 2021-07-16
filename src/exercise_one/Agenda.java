package exercise_one;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.pegarNome() == nome) {
                return contato;
            }
        }
        return null;
    }

    public void excluirContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.pegarNome() == nome) {
                contatos.remove(contato);
            }
        }
    }

    public int contarNumeroContatos() {
        return contatos.size();
    }
}
