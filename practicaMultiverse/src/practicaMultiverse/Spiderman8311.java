package practicaMultiverse;

public class Spiderman8311 extends Spiderman implements Secuencia{
    //Constructor
    public Spiderman8311(String nombre, String tierra) {
        super(nombre, tierra);
    }
    // Implementar metodos de --> practicaMultiverse.Secuencia
    @Override
    public String patada() {
        String seq = "Patada baja\n";
        return seq;
    }

    @Override
    public String golpe() {
        String seq = "Golpe con pastel\n";
        return seq;
    }

    @Override
    public String ataqueEsp() {
        String seq = "Ataque con mazo\n";
        return seq;
    }
}
