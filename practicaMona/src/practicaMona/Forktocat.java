package practicaMona;

//El extends nos indica que es una subclase de --> Mona
public class Forktocat extends Mona{
    // Atributos/Campos
    public String ojos;
    public int integrantes;

    // Constructor
    //Overload --> Polimorfismo: Real
    // Si no pasas ningun atributo se utilizará el --> public Mona(){  }
    public Forktocat(String nombre, String traje, int tentaculos, int bigotes, String ojos, int integrantes){
        super(nombre,traje,tentaculos,bigotes); //Estos son los elementos que se HEREDAN
        setOjos(ojos);
        setIntegrantes(integrantes);
    }

    //GET (Metodos)
    public String getOjos(){  return ojos;  }
    public int getIntegrantes(){  return integrantes;  }

    //SET (Metodos)
    public boolean setOjos(String ojos){
        if (!ojos.isEmpty()){
            this.ojos = ojos;
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
        msg += "\nColor de ojos: " + getOjos();
        msg += "\nIntegrantes: " + getIntegrantes() +"\n\n";

        return msg;
    }
}
