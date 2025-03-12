public class DipendenteA extends Dipendente 
{
    private int malattia;

    public DipendenteA(String NumeroMatricola, double Stipendio, double Straordinario, int malattia)
    {
        super(NumeroMatricola,Stipendio, Straordinario);
        this.malattia = malattia;
    }
    
    public int getMalattia() 
    {
        return malattia;
    }
 
    public void setMalattia(int malattia) 
    {
        this.malattia = malattia;
    } 

    public void prendiMalattia(int giorni) 
    {
        if (giorni > 0) {
            malattia += giorni; 
        } 
        else 
        {
            System.out.println("Numero di giorni di malattia non valido");
        }
    }

    @Override
    public double Paga() 
    {
        double p = super.Paga(); 
        
        if (malattia == 0) 
        {
            return p; 
        } 
        else 
        {
            return p - (malattia * 15.0);
        }
    }

    @Override
    public double Paga(int malattia) 
    {
        double p = super.Paga(malattia); 
        if (this.malattia > 0) 
        {
            p -= this.malattia * 15.0;
        }
        return p;
    }

    @Override
   public void MostraDettagli()
   {
       super.MostraDettagli();
       System.out.println("Giorni di malattia: " + malattia);
   }
}

