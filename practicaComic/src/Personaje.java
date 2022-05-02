public class Personaje extends Elemento {
    private int posPx;
    private int posPy;
    private String folderSrc;
    private String msg;
    Screen s = new Screen();

    public Personaje(){  }
    public Personaje (String folderSrc, int posPx, int posPy, int dimx, int dimy) {
        setFolderSrc(folderSrc);
        setPosPx(posPx);
        setPosPy(posPy);
        setDimx(dimx);
        setDimy(dimy);
    }

    public int getPosPx(){  return posPx;  }
    public int getPosPy(){  return posPy;  }
    public String getFolderSrc() {  return folderSrc;  }

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
    public boolean setFolderSrc(String folderSrc) {
        if (!folderSrc.isEmpty()){
            this.folderSrc = folderSrc;
            return true;
        } else return false;
    }
    public void mostrar() {  s.setVisible(true);  }

    @Override
    public String printState(){
        this.msg = "posPx: " + getPosPx();
        this.msg += "posPy: " + getPosPy();
        this.msg += "posx: " + getPosx();
        this.msg += "posy: " + getPosy();
        this.msg += "dimx: " + getDimx();
        this.msg += "dimy: " + getDimy();
        this.msg += "Src: " + getFolderSrc();
        return this.msg;
    }
}
