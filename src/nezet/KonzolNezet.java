
package nezet;

import java.util.Scanner;

public class KonzolNezet {
    private static Scanner sc= new Scanner(System.in);
    
    public String elsobekeres(){
        megjelenit("Add meg a neved: ");
        return sc.next();
}
    
    public String masodikbekeres(){
        megjelenit("Add meg az mikor születtél:");
        return sc.next();
}
    public String harmadikbekeres(){
        megjelenit("Ha tudsz, milyen nyelven tudsz:");
        return sc.next();
}

    public void megjelenit(String uzenet) {
        System.out.println(uzenet);
    }
    
    private void bezar(){
        sc.close();
    }


    
}

