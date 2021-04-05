public class Conto extends Bank
{
    int nummer;
    double stand;
    public Conto(int num)                           //Creates a new account
    {
        nummer = num;
        stand = 0;
    }
   

    public void abheben(double betrag)              //retrieves a sum of money from the account
    {
        double gesamtbetrag = betrag + 0.5;
        if (stand-gesamtbetrag < -5000){
        }
        else{ 
            stand = stand - gesamtbetrag;
        }
    }
    
    public void einzahlen(double betrag)            //adds a sum of money to the account
    {
        stand = stand + betrag - 0.5;
    }
    
    public int getNummer()                          //returns number of the account
    {
        return nummer;
    }
    
    public double getStand()                        //returns the sum of money in the account
    {
        return stand;
    }
    
    public void anzeigen()                          //prints money and number of the account
    {
        System.out.println("Kontonummer: " + nummer);
        System.out.println("Kontostand: " + stand);
    }
    
    public void verzinsen(double zinssatz){         //lays interest on account
        stand = stand-(stand*zinssatz);
    }
}
