package Klasslar;

/**
 * Created by User on 06.04.2016.
 */
public class EngKattasiKichigi {
    public static void main(String[] args) {
        int massiv[] = {2,3,6,9,7,4,5,8,1};
        int max = massiv[0];
        int min = massiv[1];

        for (int i = 0;i<massiv.length;i++){
            if (max<massiv[i]){
                max = massiv[i];
            }
            if (min>massiv[i]){
                min = massiv[i];
            }

        }
        System.out.printf("Max = '%d'\n Min = '%d'",max,min);
    }
}
