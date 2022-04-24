package practicaMona;

public class DefMonas {
    public static String metDefMonas(int opc){
        Mona monas[] = new Mona[6];

        monas[0] = new ClassAct("Class Act","Clasico",5,
                4,"Der","Izq");
        monas[1] = new OctobiWan("Octobi Wan Catnobi","Jedi",5,
                4,"Maestro","Luz");
        monas[2] = new Puppeteer("Puppeteer","Clasico",5,
                4,"Izq",1);
        monas[3] = new Benevocats("Benevocats","Clasico",4,
                0,"Tierra",10);
        monas[4] = new Forktocat("Forktocat","Clasico + Azul",5,
                2,"Cafe + Azul",2);
        monas[5] = new Repo("Repo","Clasico",5,
                0,"Negra",5);

        return monas[opc].printState();
    }
}
