package Klasslar;

/**
 * Created by O2B3K on 07.04.2016. 15:08
 */
public class VaqtMain {
    public static void main(String[] args) {
        VaqtArg ob1 = new VaqtArg();
        VaqtArg ob2 = new VaqtArg(19);
        VaqtArg ob3 = new VaqtArg(19,40);
        VaqtArg ob4 = new VaqtArg(19,40,12);
        System.out.printf("%s\n",ob1.vaqtKorsat());
        System.out.printf("%s\n",ob2.vaqtKorsat());
        System.out.printf("%s\n",ob3.vaqtKorsat());
        System.out.printf("%s\n",ob4.vaqtKorsat());
    }
}
