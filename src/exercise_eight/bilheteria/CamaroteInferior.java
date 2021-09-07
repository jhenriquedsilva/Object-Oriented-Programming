package exercise_eight.bilheteria;

public class CamaroteInferior extends VIP {

    private Integer cadeira;
    private Character fila;

    public CamaroteInferior(Integer cadeira, Character fila) {
        super();
        this.cadeira = cadeira;
        this.fila = fila;
    }

    public Integer getCadeira() {
        return cadeira;
    }

    public Character getFila() {
        return fila;
    }

    public String getLocalizacao() {
        return String.format("%c%d",getFila(),getCadeira());
    }

    public void imprimeLocalizacao() {
        System.out.println(String.format("Localização do ingresso: %c%d",getFila(),getCadeira()));
    }
}
