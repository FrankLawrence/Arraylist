public class Test
{
    Conto k1 = new Conto(100);
    Conto k2 = new Conto(200);
    Conto k3 = new Conto(300);
    Bank b = new Bank();
    public Test()
    {
        b.kontoHinzufuegen(k1);
        b.kontoHinzufuegen(k2);
        b.kontoHinzufuegen(k3);
        k1.anzeigen();
        k2.anzeigen();
        k3.anzeigen();
    }
}