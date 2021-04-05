import java.util.ArrayList;
public class Kunde
{
    private String name, vorname;
    private ArrayList konten;
    public Kunde(String n, String v)
    {
        name = n;
        vorname = v;
        konten = new ArrayList();
    }

    public void kontoHinzufuegen(Conto neu){
        konten.add(neu);
    }

    void anzeigen(){
        System.out.println("Name: " + name);
        System.out.println("Vorname: " + vorname);
        for (int i = 0; i<100; i++){
            Conto k = (Conto) konten.get(i);
            System.out.println("Konto" + i + ": ");
            k.anzeigen();
        }
    }

    /*double guthaben(){
        for (int i = 0; i<100; i++){
            int guthaben = neu.getStand();
        }
    }*/
}
