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
