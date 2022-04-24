package practicaMona;

public class Mona {
    // Atributos/Campos
    public String nombre;
    public String traje;
    public int tentaculos;
    public int bigotes;

    // Constructores
    public Mona(){  }
    public Mona(String nombre,String traje,int tentaculos,int bigotes){
        setNombre(nombre);
        setTraje(traje);
        setTentaculos(tentaculos);
        setBigotes(bigotes);
    }

    //GET (Metodos)
    public String getNombre(){  return nombre;  }
    public String getTraje(){  return traje;  }
    public int getTentaculos(){  return tentaculos;  }
    public int getBigotes(){  return bigotes;  }

    //SET (Metodos)
    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else return false;
    }
    public boolean setTraje(String traje){
        if (!traje.isEmpty()){
            this.traje = traje;
            return true;
        } else return false;
    }
    public boolean setTentaculos(int tentaculos){
        if (tentaculos > 0){
            this.tentaculos = tentaculos;
            return true;
        }else return false;
    }
    public boolean setBigotes(int bigotes){
        if (bigotes>=0){
            this.bigotes = bigotes;
            return true;
        }else return false;
    }

    //Metodo de control
    public String printState(){
        String msg = "Nombre: " + getNombre();
        msg += "\nTraje: " + getTraje();
        msg += "\nTentaculos: " + getTentaculos();
        msg += "\nBigotes: " + getBigotes() + "\n\n";

        return msg;
    }
}
