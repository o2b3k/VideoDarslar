package Klasslar;

/**
 * Created by User on 06.04.2016.
 */
public class OrinAlmashtirish {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.printf("a=%d,b=%d\n", a, b);
        int vaqtinchalik;
        vaqtinchalik = a;
        a = b;
        b = vaqtinchalik;
        System.out.printf("a=%d,b=%d",a,b);
    }
}
