package exercise_eight.zoologico;

public class Animal {

    protected String nome;
    protected Double comprimento;
    protected Integer numeroDePatas;
    protected String cor;
    protected String ambiente;
    protected Double velocidade;

    public Animal(String nome, Double comprimento, Integer numeroDePatas, String cor, String ambiente, Double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroDePatas = numeroDePatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Integer getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(Integer numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return String.format("---------------%nAnimal: %s%nComprimento: %2f cm%nPatas: %d%nCor: %s%nAmbiente: %s%nVelocidade: %2f m/s%n---------------",nome,comprimento,numeroDePatas,cor,ambiente,velocidade);
    }
}
