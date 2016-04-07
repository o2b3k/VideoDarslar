package Klasslar;

/**
 * Created by User on 06.04.2016.
 * massivning elementi qanchanchi indexda
 * turganini topish programmasi
 */
public class MassivIndexi {
    public static void main(String[] args) {
        int massiv[] = {6,9,5,2,3,1,4,7,8,10};
        int index = -1, qidiruvRaqami = 8;

        for (int i=0;i<massiv.length;i++){
            if (massiv[i]==qidiruvRaqami) index = i;
        }
        System.out.printf("'%d' massivning '%d'-elementida joylashgan",qidiruvRaqami,index);
    }
}
