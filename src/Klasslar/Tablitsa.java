package Klasslar;

/**
 * Created by O2B3K on 06.04.2016.
 * ikki olchamli massiv tuzish tablitsa shaklida
 * asosiy main metodda massivni elon qildik
 * kursatish degan metodda massivni tablitsa shaklida
 * chiqardik
 */
public class Tablitsa {
    public static void main(String[] args) {
        int massiv1[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int massiv2[][] = {{20,21,22},{64},{40,41,42}};
        System.out.println("Bu massiv1");
        kursatish(massiv1);
        System.out.println();
        System.out.println("Bu massiv2");
        kursatish(massiv2);
    }
    public static void kursatish(int x[][]){
        for (int qator=0;qator<x.length;qator++){
            for (int ustun=0;ustun<x[qator].length;ustun++)
                System.out.print(x[qator][ustun] + "\t");
            System.out.println();
        }
    }
}
