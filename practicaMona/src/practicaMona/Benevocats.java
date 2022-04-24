package practicaMona;

//El extends nos indica que es una subclase de --> Mona
public class Benevocats extends Mona{
    // Atributos/Campos
    public String mundo;
    public int integrantes;

    // Constructor
    //Overload --> Polimorfismo: Real
    // Si no pasas ningun atributo se utilizará el --> public Mona(){  }
    public Benevocats(String nombre, String traje, int tentaculos, int bigotes, String mundo, int integrantes){
        super(nombre,traje,tentaculos,bigotes); //Estos son los elementos que se HEREDAN
        setMundo(mundo);
        setIntegrantes(integrantes);
    }

    //GET (Metodos)
    public String getMundo(){  return mundo;  }
    public int getIntegrantes(){  return integrantes;  }

    //SET (Metodos)
    public boolean setMundo(String mundo){
        if (!mundo.isEmpty()){
            this.mundo = mundo;
            return true;
        } else return false;
    }
    public boolean setIntegrantes(int integrantes){
        if (integrantes >0){
            this.integrantes = integrantes;
            return true;
        } else return false;
    }

    //Metodo de control
    //Sobreescribimos el metodo --> printState() de la clase --> Mona
    @Override
    public String printState(){
        String msg = "Nombre: " + getNombre();
        msg += "\nTraje: " + getTraje();
        msg += "\nTentaculos: " + getTentaculos();
        msg += "\nBigotes: " + getBigotes();
        msg += "\nMundo: " + getMundo();
        msg += "\nIntegrantes: " + getIntegrantes() +"\n\n";

        return msg;
    }
}
