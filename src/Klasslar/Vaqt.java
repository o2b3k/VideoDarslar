package Klasslar;

/**
 * Created by O2B3K on 06.04.2016.23:00
 */
public class Vaqt {
    private int soat;
    private int daqiqa;
    private int soniya;

    public void vaqtOrnat(int soatArg,int daqiqaArg,int soniyaArg){
        soat = (soatArg>0 && soatArg<24)?soatArg:0;
        daqiqa = (daqiqaArg>0 && daqiqaArg<60)?daqiqaArg:0;
        soniya = (soniyaArg>0 && soatArg<60)?soniyaArg:0;
    }

    public String vaqtKorsat(){
        return String.format("%02d:%02d:%02d",soat,daqiqa,soniya);
    }
}
