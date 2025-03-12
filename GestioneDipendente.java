public class GestioneDipendente 
{
    public static void main(String[] args) 
    {
        Dipendente dipendente = new Dipendente("CNCJCW", 1000.00, 7.50);
        double pagaDipendente = dipendente.Paga(10);
        System.out.println("Paga per Dipendente (con 10 giorni di malattia): " + pagaDipendente);
        System.out.println("Stipendio del Dipendente: " + dipendente.getstipendio());


        DipendenteA dipendenteA = new DipendenteA("HUEHCW", 1500.00, 8.50, 0);
        dipendenteA.prendiMalattia(5);
        double pagaDipendenteA = dipendenteA.Paga(3);
        System.out.println("Paga per DipendenteA (con 3 giorni di malattia e 5 giorni di malattia già presi): " + pagaDipendenteA);
        dipendenteA.MostraDettagli();
    }
}

