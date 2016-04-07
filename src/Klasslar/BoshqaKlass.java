package Klasslar;

/**
 * Created by User on 06.04.2016.
 */
public class BoshqaKlass {
    private String ustozismi;

    public void setUstozismi(String ustozismi) {
        this.ustozismi = ustozismi;
    }

    public String getUstozismi(){
        return ustozismi;
    }

    public void aytish(){
        System.out.println("Sizning ustozingiz ismi "+getUstozismi());
    }
}
