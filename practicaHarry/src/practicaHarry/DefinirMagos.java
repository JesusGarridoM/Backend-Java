package practicaHarry;

public class DefinirMagos {
    public String bdMago(int opt){
        Mago harry = new Mago("Harry James Potter","Mestiza","Humana",
                "Masculino","Dementor","Ciervo","Gryffindor");

        Mago hermione = new Mago("Hermione Jean Granger","Hija de Muggles","Humana",
                "Femenino","La profesora McGonagall diciéndole que reprobó todo",
                "Nutria","Gryffindor");

        Mago george = new Mago("George Weasley","Pura","Humana",
                "Masculino","Lord Voldemort","Urraca","Gryffindor");

        Mago ronald = new Mago("Ronald Weasley","Pura","Humana",
                "Masculino","Acromantula","Jack Russell Terrier","Gryffindor");

        Mago dumbledore = new Mago("Albus Percival Wulfric Brian Dumbledore","Mestiza",
                "Humana","Masculino","El cuerpo de su hermana Ariana",
                "Fénix","Gryffindor");

        if (opt == 0){  return harry.printState();  }
        else if (opt == 1){  return hermione.printState();  }
        else if (opt == 2){  return george.printState();  }
        else if (opt == 3){  return ronald.printState();  }
        else if (opt == 4){  return dumbledore.printState();  }
        else return "Lo sentimos, no se encuentra la información";
    }
}
