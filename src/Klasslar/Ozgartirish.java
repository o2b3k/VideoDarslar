package Klasslar;

/**
 * Created by O2B3K on 06.04.2016.
 */
public class Ozgartirish {
    public static void main(String[] args) {
        int massiv[] = {0,1,2,3,4,5};
        for (int y:massiv)
            System.out.printf("%d, ",y);
        System.out.println();

        uzgartirish(massiv);

        for (int y:massiv)
            System.out.printf("%d, ", y);
    }
    public static void uzgartirish(int x[]){
        for (int i=0;i<x.length;i++)
            x[i] += 5;
    }
}
