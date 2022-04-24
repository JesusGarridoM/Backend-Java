package practicaMona;

public class ClassAct extends Mona{
    // Atributos/Campos
    public String sombrero;
    public String lente;

    // Constructor
    // Si no pasas ningun atributo se utilizará el --> public Mona(){  }
    public ClassAct(String nombre, String traje, int tentaculos, int bigotes, String sombrero, String lente){
        super(nombre,traje,tentaculos,bigotes); //Estos son los elementos que se HEREDAN
        setSombrero(sombrero);
        setLente(lente);
    }

    //GET (Metodos)
    public String getSombrero(){  return sombrero;  }
    public String getLente(){  return lente;  }

    //SET (Metodos)
    public boolean setSombrero(String sombrero){
        if (!sombrero.isEmpty()){
            this.sombrero = sombrero;
            return true;
        } else return false;
    }
    public boolean setLente(String lente){
        if (!lente.isEmpty()){
            this.lente = lente;
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
        msg += "\nSombrero: " + getSombrero();
        msg += "\nLente: " + getLente() +"\n\n";

        return msg;
    }
}
