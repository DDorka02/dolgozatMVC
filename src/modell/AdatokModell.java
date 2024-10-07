package modell;

public class AdatokModell {
    
    private final Adat[] adatok;
    private String adat;
    
    public AdatokModell(){
        adatok = new Adat[1];
        adatok[0] = new Adat("János","2002.10.12","angol");
    }

    public String kezdes() {
        String s = "Adatok:";
//        for (Adat adat : adatok) {
//            int i=1;
////            String n = adatok.getNev();
////            String k = adatok.getKor();
////            String ny = adatok.getNyelv();
////            s+= i++ + ". név:" + n + "kora: " + k + "nyelv"+ ny +"\n";
//        }
        return s;
    }
    
    public String getAdat(String elsobekeres){
        return adat;
    }

    public void setAdat(String adat) {
        this.adat = adat;
    }
    
    

}
