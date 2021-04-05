public class Main {

    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Conto konto1 = new Conto(100);
        bank1.kontoHinzufuegen(konto1);
    }
}
