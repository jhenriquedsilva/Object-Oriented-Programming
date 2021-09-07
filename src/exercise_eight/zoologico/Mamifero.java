package exercise_eight.zoologico;

import exercise_eight.zoologico.Animal;

public class Mamifero extends Animal {

    String alimento;

    public Mamifero(String nome, Double comprimento, Integer numeroDePatas, String cor, String ambiente, Double velocidade, String alimento) {
        super(nome,comprimento,numeroDePatas,cor,ambiente,velocidade);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return String.format("---------------%nAnimal: %s%nComprimento: %2f cm%nPatas: %d%nCor: %s%nAmbiente: %s%nVelocidade: %2f m/s%nAlimento: %s%n---------------",nome,comprimento,numeroDePatas,cor,ambiente,velocidade, alimento);
    }
}
