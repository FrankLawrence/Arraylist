import java.util.ArrayList;
public class Bank
{
    private ArrayList kontoListe;                    //declares new Arraylist called kontoListe
    public Bank(){
        kontoListe = new ArrayList();               //declares new Arraylist called kontoListe 2.
    }

    public void kontoHinzufuegen(Conto neu){
        kontoListe.add(neu);
        neu.anzeigen();
    }
    
    public void laengeAnzeigen(){
        System.out.println(kontoListe.size());
    }

    public void kontenAnzeigen(){
        System.out.println("Kontoliste: ");
        for (int i = 0; i < 100; i++) {
            Conto k = (Conto) kontoListe.get(i);
            k.anzeigen();
        }
    }
    
    /*public void kontenVerzinsen(double zinssatz){
        
    }*/
}