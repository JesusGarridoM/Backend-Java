package practicaMultiverse;

public class Spiderman928 extends Spiderman implements Secuencia{
    // Constructor
    public Spiderman928(String nombre, String tierra) {
        super(nombre, tierra);
    }
    // Implementar metodos de --> practicaMultiverse.Secuencia
    @Override
    public String patada() {
        String seq = "Patada voladora\n";
        return seq;
    }

    @Override
    public String golpe() {
        String seq = "Golpe con garras\n";
        return seq;
    }

    @Override
    public String ataqueEsp() {
        String seq = "Ataque invisible\n";
        return seq;
    }
}
