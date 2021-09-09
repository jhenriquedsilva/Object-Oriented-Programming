package exercise_eight.zoologico;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Animal("Camelo",150.0,4,"Amarelo","Terra",2.0));
        animais.add(new Peixe("Tubarão",300.0,0,"Cinzento","Mar",1.5,"Barbatanas e Cauda"));
        animais.add(new Mamifero("Urso-do-canadá",180.0,4,"Vermelho","Terra",0.5, "Mel"));

        for (Animal animal : animais) {
            System.out.println(animal);
        }
    }
}
// Exemplo de execução
/**
 * ---------------
 * Animal: Camelo
 * Comprimento: 150,000000 cm
 * Patas: 4
 * Cor: Amarelo
 * Ambiente: Terra
 * Velocidade: 2,000000 m/s
 * ---------------
 * ---------------
 * Animal: Tubarão
 * Comprimento: 300,000000 cm
 * Patas: 0
 * Cor: Cinzento
 * Ambiente: Mar
 * Velocidade: 1,500000 m/s
 * Característica: Barbatanas e Cauda
 * ---------------
 * ---------------
 * Animal: Urso-do-canadá
 * Comprimento: 180,000000 cm
 * Patas: 4
 * Cor: Vermelho
 * Ambiente: Terra
 * Velocidade: 0,500000 m/s
 * Alimento: Mel
 * ---------------
 */
