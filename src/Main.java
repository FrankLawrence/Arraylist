public class Main {

    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Conto konto1 = new Conto(100);
        bank1.kontoHinzufuegen(konto1);
        Kunde kunde1 = new Kunde("Lawrence", "Frank");
        kunde1.kontoHinzufuegen(konto1);
        kunde1.anzeigen();
    }
}
