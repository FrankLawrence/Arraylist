public class Conto extends Bank
{
    int nummer;
    double stand;
    public Conto(int num)
    {
        nummer = num;
        stand = 0;
    }
   

    public void abheben(double betrag)
    {
        double gesamtbetrag = betrag + 0.5;
        if (stand-gesamtbetrag < -5000){
        }
        else{ 
            stand = stand - gesamtbetrag;
        }
    }
    
    public void einzahlen(double betrag)
    {
        stand = stand + betrag - 0.5;
    }
    
    public int getNummer()
    {
        return nummer;
    }
    
    public double getStand()
    {
        return stand;
    }
    
    public void anzeigen()
    {
        System.out.println("Kontonummer: " + nummer);
        System.out.println("Kontostand: " + stand);
    }
    
    public void verzinsen(double zinssatz){
        stand = stand-(stand*zinssatz);
    }
}
