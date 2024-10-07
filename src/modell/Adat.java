package modell;

public class Adat {
    private String nev, nyelv;
    private String kor;

    
    public Adat(String nev, String kor){
        this(nev,kor,"angol");
    
}
    public Adat(String nev, String kor, String nyelv){
        this.nev=  nev;
        this.kor= kor;
        this.nyelv= nyelv;
    
}

    public String getNev() {
        return nev;
    }

    public String getKor() {
        return kor;
    }

    public String getNyelv() {
        return nyelv;
    }
   
}
