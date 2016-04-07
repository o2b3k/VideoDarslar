package Klasslar;

import java.util.Random;

/**
 * Created by User on 06.04.2016.
 */
public class Tasodif {
    public static void main(String[] args) {
        Random tasodifiySon = new Random();
        for (int i=0;i<10;i++) {
            int son = tasodifiySon.nextInt(10)+1;
            System.out.printf("%d, ",son);
        }
    }
}
