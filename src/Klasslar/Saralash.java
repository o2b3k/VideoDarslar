package Klasslar;

/**
 * Created by User on 06.04.2016.
 * massivni saralash orin almashtirish usulida
 */
public class Saralash {
    public static void main(String[] args) {
        int massiv[] = {6,1,4,3,8};
        for (int i=0;i<massiv.length;i++)
            System.out.printf("%d, ",massiv[i]);
        System.out.println();

        int vaqtincha;
        for (int i=0;i<massiv.length;i++)
            for (int j=0;j<i;j++)
                if (massiv[i]<massiv[j]){
                    vaqtincha = massiv[i];
                    massiv[i] = massiv[j];
                    massiv[j] = vaqtincha;
                }
        for (int i=0;i<massiv.length;i++)
            System.out.printf("%d, ",massiv[i]);
    }
}
