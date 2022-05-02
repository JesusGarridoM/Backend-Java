public class Elemento {
    private int posx;
    private int posy;
    private int dimx;
    private int dimy;
    private String msg;

    public int getPosx(){  return posx;  }
    public int getPosy(){  return posy;  }
    public int getDimx(){  return dimx;  }
    public int getDimy(){  return dimy;  }

    public boolean setPosx (int posx) {
        if (posx>0){
            this.posx = posx;
            return true;
        } else return false;
    }
    public boolean setPosy (int posy) {
        if (posy>0){
            this.posy = posy;
            return true;
        } else return false;
    }
    public boolean setDimx (int dimx) {
        if (dimx>0){
            this.dimx = dimx;
            return true;
        } else return false;
    }
    public boolean setDimy (int dimy) {
        if (dimy>0){
            this.dimy = dimy;
            return true;
        } else return false;
    }

    public String printState(){
        this.msg = "posx: " + getPosx();
        this.msg += "posy: " + getPosy();
        this.msg += "dimx: " + getDimx();
        this.msg += "dimy: " + getDimy();
        return this.msg;
    }
}
