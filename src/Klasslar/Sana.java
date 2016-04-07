package Klasslar;

/**
 * Created by O2B3K on 07.04.2016. 15:32
 * toString() metodi orqali
 */
public class Sana {
    private int kun;
    private int oy;
    private int yil;

    public Sana(int kun,int oy,int yil){
        this.kun = kun;
        this.oy = oy;
        this.yil = yil;
        System.out.printf("O`rantilgan sana: %s \n",this);
    }

    public String toString(){
        return String.format("%02d:%02d:%04d yil",kun,oy,yil);
    }
}
