import practicaHarry.DefinirMagos;

import java.util.Locale;

public class ScreenMago {
    public static void main(String[] args){
        Screen screen = new Screen();
        Dialog entrada = new Dialog();
        DefinirMagos magoSelect = new DefinirMagos();
        Object[] opt;
        int magoOpt;

        opt = new Object[]{"Harry", "Hermione", "George","Ronald","Dumbledore"};
        magoOpt = entrada.readOption(opt,"Elige a tu personaje","Magos",0);

        System.out.println(magoSelect.bdMago(magoOpt)); //Muestra la info en la consola
        screen.setVisible(true);
        screen.out(magoSelect.bdMago(magoOpt)); //Muestra la info en la screen
        screen.showImage("src/img/" + opt[magoOpt].toString().toLowerCase() + ".jpg"); //Muestra la imagen
        screen.setBounds(200,50,600,600);
        screen.
    }
}
