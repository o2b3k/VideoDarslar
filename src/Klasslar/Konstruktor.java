package Klasslar;

/**
 * Created by User on 06.04.2016.
 */
public class Konstruktor {

    private String ustozIsmi;

    public Konstruktor(String ismi){
        setUstozIsmi(ismi);
    }

    public void setUstozIsmi(String ismi){
        this.ustozIsmi = ismi;
    }
    public String getUstozIsmi(){
        return ustozIsmi;
    }
    public void aytish(){
        System.out.println("Ustozingiz ismi: "+getUstozIsmi());
    }
}
