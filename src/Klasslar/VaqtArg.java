package Klasslar;

/**
 * Created by O2B3K on 07.04.2016. 14:58
 */
public class VaqtArg {
    private int soat;
    private int daqiqa;
    private int soniya;

    public VaqtArg(){
        this(0,0,0);
    }

    public VaqtArg(int soatArg){
        this(soatArg,0,0);
    }
    public VaqtArg(int soatArg,int daqiqaArg){
        this(soatArg,daqiqaArg,0);
    }
    public VaqtArg(int soatArg,int daqiqaArg,int soniyaArg){
        vaqtOrnat(soatArg,daqiqaArg,soniyaArg);
    }

    private void vaqtOrnat(int soatArg, int daqiqaArg, int soniyaArg) {
        soatOrnat(soatArg);
        daqiqaOrnat(daqiqaArg);
        soniyaOrnat(soniyaArg);
    }


    private void soatOrnat(int soatArg) {
        soat = (soatArg>0 && soatArg<24)?soatArg:0;
    }

    private void daqiqaOrnat(int daqiqaArg) {
        daqiqa = (daqiqaArg>=0 && daqiqaArg<60)?daqiqaArg:0;
    }
    private void soniyaOrnat(int soniyaArg) {
        soniya = (soniyaArg>=0 && soniyaArg<60)?soniyaArg:0;
    }
    public int soatOl(){
        return soat;
    }
    public int daqiqaOl(){
        return daqiqa;
    }
    public int soniyaOl(){
        return soniya;
    }
    public String vaqtKorsat(){
        return String.format("%02d:%02d:%02d",soatOl(),daqiqaOl(),soniyaOl());
    }
}
