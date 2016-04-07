package Klasslar;

/**
 * Created by O2B3K on 06.04.2016.22:50
 * bir nechta sonlarni ortacha qiymatini topish!
 * urtacha metodda bir nechta yoki undan kop raqam
 * o`ziga olishi mumkun
 */
public class Ortacha {
    public static void main(String[] args) {
        System.out.println(urtacha(1,2,3,4,5,6));
    }
    public static double urtacha(int...raqamlar){
        double natija = 0;
        for (int x:raqamlar){
            natija += x;
        }
        return (natija/raqamlar.length);
    }
}
