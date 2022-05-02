public class Dialogo extends Elemento {
    private int posPx;
    private int posPy;
    private String dialogo;
    private String msg;
    Screen s = new Screen();

    public Dialogo(){  }
    public Dialogo (String dialogo, int posPx, int posPy, int dimx, int dimy) {
        setDialogo(dialogo);
        setPosPx(posPx);
        setPosPy(posPy);
        setDimx(dimx);
        setDimy(dimy);
    }

    public int getPosPx(){  return posPx;  }
    public int getPosPy(){  return posPy;  }
    public String getDialogo() {  return dialogo;  }

    public boolean setPosPx (int posPx) {
        if (posPx>0){
            this.posPx = posPx;
            return true;
        } else return false;
    }
    public boolean setPosPy (int posPy) {
        if (posPy>0){
            this.posPy = posPy;
            return true;
        } else return false;
    }
    public boolean setDialogo(String dialogo) {
        if (!dialogo.isEmpty()){
            this.dialogo = dialogo;
            return true;
        } else return false;
    }
    public void mostrar() {  s.setVisible(true);  }

    @Override
    public String printState(){
        this.msg = "Dialogo: " + getDialogo();
        this.msg += "posPx: " + getPosPx();
        this.msg += "posPy: " + getPosPy();
        this.msg += "posx: " + getPosx();
        this.msg += "posy: " + getPosy();
        this.msg += "dimx: " + getDimx();
        this.msg += "dimy: " + getDimy();
        return this.msg;
    }

}
