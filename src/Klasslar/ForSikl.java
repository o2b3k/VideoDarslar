package Klasslar;

/**
 * Created by O2B3K on 06.04.2016.
 * kuchaytirilgan for sikli
 * for siklini ochayotganda massiv tipi bilan
 * sikl ochilayotgan tip bir xil bolishi kerak
 */
public class ForSikl {
    public static void main(String[] args) {
        int massiv[] = {10,10,10,10};
        int yigindi = 0;
        for (int x:massiv){
            yigindi += x;
        }
        System.out.println(yigindi);
    }
}
