import practicaMultiverse.*;

public class ScreenSpiderman {
    public static void main(String[] args) {
        // Atributos
        int spiderOpt;
        String str;

        // Objetos
        Screen s = new Screen();
        Dialog d = new Dialog();
        Object[] opt = new Object[]{"Peter Benjamin Parker","Miguel O'Hara","Peter Porker"};
        Spiderman616 spiderman616 = new Spiderman616("Peter Benjamin Parker","616");
        Spiderman928 spiderman928 = new Spiderman928("Miguel O'Hara","928");
        Spiderman8311 spiderman8311 = new Spiderman8311("Peter Porker","8311");
        // Escoger personaje
        spiderOpt = d.readOption(opt,"Escoge a tu Spiderman:","Personajes",0);
        str = d.readString("Ingresa tu secuencia de ataque (1-2-3)");
        s.setVisible(true);

        try {
            switch (spiderOpt) {
                case 0:
                    s.out(spiderman616.printState());
                    for (char n : str.toCharArray()) {
                        switch (n) {
                            case '1': {
                                System.out.print(spiderman616.patada());
                                s.out(spiderman616.patada());
                                break;
                            }
                            case '2': {
                                System.out.print(spiderman616.golpe());
                                s.out(spiderman616.golpe());
                                break;
                            }
                            case '3': {
                                System.out.print(spiderman616.ataqueEsp());
                                s.out(spiderman616.ataqueEsp());
                                break;
                            }
                        }
                    }
                    s.showImage("src/img/spiderman616.png");
                    break;
                case 1:
                    s.out(spiderman928.printState());
                    for (char n : str.toCharArray()) {
                        switch (n) {
                            case '1': {
                                System.out.print(spiderman928.patada());
                                s.out(spiderman928.patada());
                                break;
                            }
                            case '2': {
                                System.out.print(spiderman928.golpe());
                                s.out(spiderman928.golpe());
                                break;
                            }
                            case '3': {
                                System.out.print(spiderman928.ataqueEsp());
                                s.out(spiderman928.ataqueEsp());
                                break;
                            }
                        }
                    }
                    s.showImage("src/img/spiderman928.png");
                    break;
                case 2:
                    s.out(spiderman8311.printState());
                    for (char n : str.toCharArray()) {
                        switch (n) {
                            case '1': {
                                System.out.print(spiderman8311.patada());
                                s.out(spiderman8311.patada());
                                break;
                            }
                            case '2': {
                                System.out.print(spiderman8311.golpe());
                                s.out(spiderman8311.golpe());
                                break;
                            }
                            case '3': {
                                System.out.print(spiderman8311.ataqueEsp());
                                s.out(spiderman8311.ataqueEsp());
                                break;
                            }
                        }
                    }
                    s.showImage("src/img/spiderman8311.png");
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
