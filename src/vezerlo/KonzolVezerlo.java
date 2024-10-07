package vezerlo;

import modell.AdatokModell;
import nezet.KonzolNezet;


public class KonzolVezerlo {
    
    private AdatokModell modell;
    private KonzolNezet nezet;

    public KonzolVezerlo(AdatokModell modell, KonzolNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        start();
        
    }
    private void start() {
        nezet.megjelenit(modell.kezdes());
        modell.getAdat(nezet.elsobekeres());
        modell.getAdat(nezet.masodikbekeres());
        modell.getAdat(nezet.harmadikbekeres());
    }
}
