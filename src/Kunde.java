import java.util.ArrayList;
public class Kunde
{
    private String name, vorname;
    private ArrayList konten;
    public Kunde(String n, String v)                    //creates new customer with list for accounts
    {
        name = n;
        vorname = v;
        konten = new ArrayList();
    }

    public void kontoHinzufuegen(Conto neu){            //adds account to his accountlist
        konten.add(neu);
    }

    void anzeigen(){                                    //prints out accounts from his accountlist with his name
        System.out.println("Name: " + name);
        System.out.println("Vorname: " + vorname);
        for (int i = 0; i<100; i++){
            Conto k = (Conto) konten.get(i);
            System.out.println("Konto" + i + ": ");
            k.anzeigen();
        }
    }

    double guthaben(){
        double guthaben = 0;
        for (int i = 0; i < 100; i++) {
            Conto k = (Conto) konten.get(i);
            guthaben += k.getStand();
        }
        return guthaben;
    }
}
