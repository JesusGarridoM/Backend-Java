public class Escenario extends Elemento {
    private int num;
    private String imgSrc;
    private String msg;
    private int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width/4;
    private int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height/2;
    Screen s = new Screen();

    public Escenario(){  }
    public Escenario (String imgSrc, int num) {
        setImgSrc(imgSrc);
        setNum(num);
    }

    public int getNum() {
        return num;
    }
    public String getImgSrc() {
        return imgSrc;
    }

    public boolean setNum(int num) {
        if (num>0 & num<9){
            this.num = num;
            if (num<5) {  s.setBounds((num*ancho)-ancho,0,ancho,alto);  }
            else {  s.setBounds(((num-4)*ancho)-ancho,alto,ancho,alto);  }
            return true;
        } else return false;
    }
    public boolean setImgSrc(String imgSrc) {
        if (!imgSrc.isEmpty()){
            this.imgSrc = imgSrc;
            s.showImage(imgSrc);
            return true;
        } else return false;
    }
    public void mostrar() {  s.setVisible(true);  }

    @Override
    public String printState(){
        this.msg = "Num: " + getNum();
        this.msg += "posx: " + getPosx();
        this.msg += "posy: " + getPosy();
        this.msg += "dimx: " + getDimx();
        this.msg += "dimy: " + getDimy();
        this.msg += "Src: " + getImgSrc();
        return this.msg;
    }
}
