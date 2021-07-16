package exercise_one;

public class Contato {
    private String nome;
    private String email;

    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String pegarNome() {
        return this.nome;
    }

    public String pegarEmail() {
        return this.email;
    }
}
