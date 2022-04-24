package practicaMona;

//El extends nos indica que es una subclase de --> Mona
public class Repo extends Mona{
    // Atributos/Campos
    public String caja;
    public int integrantes;

    // Constructor
    //Overload --> Polimorfismo: Real
    // Si no pasas ningun atributo se utilizará el --> public Mona(){  }
    public Repo(String nombre, String traje, int tentaculos, int bigotes, String caja, int integrantes){
        super(nombre,traje,tentaculos,bigotes); //Estos son los elementos que se HEREDAN
        setCaja(caja);
        setIntegrantes(integrantes);
    }

    //GET (Metodos)
    public String getCaja(){  return caja;  }
    public int getIntegrantes(){  return integrantes;  }

    //SET (Metodos)
    public boolean setCaja(String caja){
        if (!caja.isEmpty()){
            this.caja = caja;
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
        msg += "\nColor de caja: " + getCaja();
        msg += "\nIntegrantes: " + getIntegrantes() +"\n\n";

        return msg;
    }
}
