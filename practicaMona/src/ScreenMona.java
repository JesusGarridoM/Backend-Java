import practicaMona.DefMonas;

public class ScreenMona {
    public static void main(String[] args){
        // Atributos
        int monaOpt;
        // Objetos
        Object[] opt = new Object[]{"Class Act","Octobi Wan Catnobi",
                "Puppeteer","Benevocats","Forktocat","Repo"};
        Screen s = new Screen();
        Dialog d = new Dialog();
        // Mostrar en la terminal y Screen la info
        monaOpt = d.readOption(opt,"Choose:","Mona The Octocat",0);
        s.setVisible(true);
        System.out.print(DefMonas.metDefMonas(monaOpt));
        s.out(DefMonas.metDefMonas(monaOpt));
        s.showImage("src/img/mona" + monaOpt + ".png"); //Muestra la imagen
        s.setBounds(200,50,600,600);
    }
}
