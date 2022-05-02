public class Recuadro extends Thread{
    private String f;
    private String imgSrc;
    private String folderSrc;
    private String msg;

    Escenario escenario = new Escenario();
    Personaje personaje = new Personaje();
    Dialogo dialogo = new Dialogo();


    public Recuadro (String f) {
        setF(f);
    }

    @Override
    public void run() {
        escenario.mostrar();
//        personaje.mostrar();
//        dialogo.mostrar();
    }

    public String getEscenario() {
        this.msg = "ESCENARIO";
        this.msg += "Num: " + escenario.getNum();
        this.msg += "posx: " + escenario.getPosx();
        this.msg += "posy: " + escenario.getPosy();
        this.msg += "dimx: " + escenario.getDimx();
        this.msg += "dimy: " + escenario.getDimy();
        this.msg += "Src: " + escenario.getImgSrc();
        return this.msg;
    }
    public String getPersonaje() {
        this.msg = "PERSONAJE";
        this.msg += "posPx: " + personaje.getPosPx();
        this.msg += "posPy: " + personaje.getPosPy();
        this.msg += "posx: " + personaje.getPosx();
        this.msg += "posy: " + personaje.getPosy();
        this.msg += "dimx: " + personaje.getDimx();
        this.msg += "dimy: " + personaje.getDimy();
        this.msg += "Src: " + personaje.getFolderSrc();
        return this.msg;
    }
    public String getDialogo() {
        this.msg = "DIALOGO";
        this.msg += "Dialogo: " + dialogo.getDialogo();
        this.msg += "posPx: " + dialogo.getPosPx();
        this.msg += "posPy: " + dialogo.getPosPy();
        this.msg += "posx: " + dialogo.getPosx();
        this.msg += "posy: " + dialogo.getPosy();
        this.msg += "dimx: " + dialogo.getDimx();
        this.msg += "dimy: " + dialogo.getDimy();
        return this.msg;
    }

    public boolean setF(String f) {
        if (!f.isEmpty()){
            this.f = f;
            return true;
        } else return false;
    }
    public void setEscenario (int num) {
        escenario.setNum(num);
        escenario.setImgSrc(f + "escenario.jpg");
    }
    public void setPersonaje (int posPx, int posPy, int dimx, int dimy) {
        personaje.setPosPx(posPx);
        personaje.setPosPy(posPy);
        personaje.setDimx(dimx);
        personaje.setDimy(dimy);
    }
    public void setDialogo (String dialogo, int posPx, int posPy, int dimx, int dimy) {
        this.dialogo.setDialogo(dialogo);
        this.dialogo.setPosPx(posPx);
        this.dialogo.setPosPy(posPy);
        this.dialogo.setDimx(dimx);
        this.dialogo.setDimy(dimy);
    }
}
