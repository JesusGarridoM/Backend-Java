package practicaMona;

//El extends nos indica que es una subclase de --> Mona
public class OctobiWan extends Mona{
    // Atributos/Campos
    public String nivel;
    public String lado;


    // Constructor
    //Overload --> Polimorfismo: Real
    // Si no pasas ningun atributo se utilizará el --> public Mona(){  }
    public OctobiWan(String nombre, String traje, int tentaculos, int bigotes, String nivel, String lado){
        super(nombre,traje,tentaculos,bigotes); //Estos son los elementos que se HEREDAN
        setNivel(nivel);
        setLado(lado);
    }

    //GET (Metodos)
    public String getNivel(){  return nivel;  }
    public String getLado(){  return lado;  }

    //SET (Metodos)
    public boolean setNivel(String nivel){
        if (!nivel.isEmpty()){
            this.nivel = nivel;
            return true;
        } else return false;
    }
    public boolean setLado(String lado){
        if (!lado.isEmpty()){
            this.lado = lado;
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
        msg += "\nNivel: " + getNivel();
        msg += "\nLado de la fuerza: " + getLado() +"\n\n";

        return msg;
    }
}
