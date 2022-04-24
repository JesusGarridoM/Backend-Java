package practicaMona;

//El extends nos indica que es una subclase de --> Mona
public class Puppeteer extends Mona{
    // Atributos/Campos
    public String sombrero;
    public int titere;

    // Constructor
    //Overload --> Polimorfismo: Real
    // Si no pasas ningun atributo se utilizará el --> public Mona(){  }
    public Puppeteer(String nombre, String traje, int tentaculos, int bigotes, String sombrero, int titere){
        super(nombre,traje,tentaculos,bigotes); //Estos son los elementos que se HEREDAN
        setSombrero(sombrero);
        setTitere(titere);
    }

    //GET (Metodos)
    public String getSombrero(){  return sombrero;  }
    public int getTitere(){  return titere;  }

    //SET (Metodos)
    public boolean setSombrero(String sombrero){
        if (!sombrero.isEmpty()){
            this.sombrero = sombrero;
            return true;
        } else return false;
    }
    public boolean setTitere(int titere){
        if (titere>0){
            this.titere = titere;
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
        msg += "\nTitere: " + getTitere() +"\n\n";

        return msg;
    }
}
