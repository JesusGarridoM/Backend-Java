package practicaHarry;

import java.util.Locale;

public class Mago {
    //Constructores
    Mago(){
    }
    public Mago(String nombre, String sangre, String especie, String genero,
                String boggart, String patronus, String casa){
        setNombre(nombre);
        setSangre(sangre);
        setEspecie(especie);
        setGenero(genero);
        setBoggart(boggart);
        setPatronus(patronus);
        setCasa(casa);
    }
    // Campos/Atributos
    public String nombre;
    public String sangre;
    public String especie;
    public String genero;
    public String boggart;
    public String patronus;
    public String casa;

    //Get (Metodos)
    public String getNombre(){  return nombre;  }
    public String getSangre(){  return sangre;  }
    public String getEspecie(){  return especie;  }
    public String getGenero(){  return genero;  }
    public String getBoggart(){  return boggart;  }
    public String getPatronus(){  return patronus;  }
    public String getCasa(){  return casa;  }

    //Set (Metodos)
    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }
    public boolean setSangre(String sangre){
        if(!sangre.isEmpty()){
            this.sangre = sangre;
            return true;
        } else
            return false;
    }
    public boolean setEspecie(String especie){
        if(!especie.isEmpty()){
            this.especie = especie;
            return true;
        } else
            return false;
    }
    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        } else
            return false;
    }
    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        } else
            return false;
    }
    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        } else
            return false;
    }
    public boolean setCasa(String casa){
        if(!casa.isEmpty()){
            this.casa = casa;
            return true;
        } else
            return false;
    }

    //Metodo de control
    public String printState(){
        String msg = "Nombre: " + getNombre();
        msg += "\nEstatus de sangre: " + getSangre();
        msg += "\nEspecie: " + getEspecie();
        msg += "\nGenero: " + getGenero();
        msg += "\nBoggart: " + getBoggart();
        msg += "\nPatronus: " + getPatronus();
        msg += "\nCasa: " + getCasa() + "\n\n";

        return msg;
    }

}
