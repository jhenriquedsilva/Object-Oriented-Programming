package exercise_eight.zoologico;

import exercise_eight.zoologico.Animal;

public class Peixe extends Animal {

    String caracteristica;

    public Peixe(String nome, Double comprimento, Integer numeroDePatas, String cor, String ambiente, Double velocidade, String caracteristica) {
        super(nome,comprimento,numeroDePatas,cor,ambiente,velocidade);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public String toString() {
        return String.format("---------------%nAnimal: %s%nComprimento: %2f cm%nPatas: %d%nCor: %s%nAmbiente: %s%nVelocidade: %2f m/s%nCaracterística: %s%n---------------",nome,comprimento,numeroDePatas,cor,ambiente,velocidade,caracteristica);
    }
}
