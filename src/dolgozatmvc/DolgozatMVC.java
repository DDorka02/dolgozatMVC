package dolgozatmvc;

import modell.AdatokModell;
import nezet.KonzolNezet;
import vezerlo.KonzolVezerlo;

public class DolgozatMVC {


    public static void main(String[] args) {
        AdatokModell modell = new AdatokModell();
        KonzolNezet nezet = new KonzolNezet();
        new KonzolVezerlo(modell, nezet);      
    }
}
