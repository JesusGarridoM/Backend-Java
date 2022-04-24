public class HolaMundo {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Dialog dia = new Dialog();
        String str;

        screen.out("Bienvenidossss","Helvetica",28,Colors.Desire);
        screen.setVisible(true);

        str = dia.readString("¿Quieres?...");
        if(str.charAt(0)=='s'){
            screen.showImage("src/harry.jpg");
            screen.out("Hola");
        } else
            screen.out("Tal vez despues", "Century Schoolbook L",28, Colors.BalticSea);
    }


}
