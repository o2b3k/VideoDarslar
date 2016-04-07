package Klasslar;

import java.util.Scanner;

/**
 * Created by User on 06.04.2016.
 */
public class MainKlass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ustozingiz ismini kiriting: \n");
        String ism = input.nextLine();
        Konstruktor ob = new Konstruktor(ism);
        ob.aytish();
    }
}
