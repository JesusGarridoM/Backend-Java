package practicaMultiverse;

public class Spiderman {
    //Atributos
    public String nombre;
    public String tierra;
    //Constructores
    public Spiderman(String nombre,String tierra){
        setNombre(nombre);
        setTierra(tierra);
    }
    //GET (Metodos)
    public String getNombre(){  return nombre;  }
    public String getTierra(){  return tierra;  }
    //SET (Metodos)
    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else return false;
    }
    public boolean setTierra(String tierra){
        if(!tierra.isEmpty()){
            this.tierra = tierra;
            return true;
        } else return false;
    }
    //Metodo de control
    public String printState(){
        String msg = "Nombre: " + getNombre();
        msg += "\nTierra: " + getTierra() + "\n\n";
        return msg;
    }
}
