package practicaMultiverse;

public class Spiderman616 extends Spiderman implements Secuencia{
    //Constructor
    public Spiderman616(String nombre, String tierra) {
        super(nombre, tierra);
    }
    // Implementar metodos de --> practicaMultiverse.Secuencia
    @Override
    public String patada() {
        String seq = "Patada al pecho\n";
        return seq;
    }
    @Override
    public String golpe() {
        String seq = "Bola de telaraña\n";
        return seq;
    }
    @Override
    public String ataqueEsp() {
        String seq = "Golpear con carro\n";
        return seq;
    }
}
