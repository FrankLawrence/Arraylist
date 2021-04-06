public class Main {

    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Conto konto1 = new Conto(100);
        Kunde kunde1 = new Kunde("Lawrence", "Frank");
        kunde1.kontoHinzufuegen(konto1);
        bank1.kundeHinzufuegen(kunde1);
        kunde1.anzeigen();
    }
}
