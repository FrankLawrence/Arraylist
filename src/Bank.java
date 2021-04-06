import java.util.ArrayList;
public class Bank
{
    private ArrayList kundeListe;                    //declares new Arraylist called kontoListe
    public Bank(){
        kundeListe = new ArrayList();               //declares new Arraylist called kontoListe 2.
    }

    public void kundeHinzufuegen(Kunde neu){        //adds an existing accoutn to the accountlist and prints it out
        kundeListe.add(neu);
        neu.anzeigen();
    }
    
    public void laengeAnzeigen(){                   //prints size of accounts Arraylist to console
        System.out.println(kundeListe.size());
    }

    public void kundenAnzeigen(){                   //runs through accountlist and prints accounts to the console
        System.out.println("Kundenliste: ");
        for (int i = 0; i < 100; i++) {
            Conto k = (Conto) kundeListe.get(i);
            k.anzeigen();
        }
    }
    
    public void kundenVerzinsen(double zinssatz){   //adds interest to accounts from the bank
        for (int i = 0; i < 100; i++) {
            Kunde k = (Kunde) kundeListe.get(i);
            k.kontenVerzinsen(zinssatz);
        }
    }
}