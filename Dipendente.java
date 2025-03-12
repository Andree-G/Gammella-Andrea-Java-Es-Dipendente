public class Dipendente
{
   private String NumeroMatricola;
   private double Stipendio;
   private double Straordinario;

   public Dipendente(String NumeroMatricola, double Stipendio, double Straordinario)
   {
     this.NumeroMatricola = NumeroMatricola;
     this.Stipendio = Stipendio;
     this.Straordinario = Straordinario;
   }


   public String getNumeromatricola()
   {
       return NumeroMatricola;
   }
   public void setNumeromatricola(String NumeroMatricola)
   {
       this.NumeroMatricola = NumeroMatricola;
   }

   public double getstipendio()
   {
       return Stipendio;
   }
   public void setstipendio(double Stipendio)
   {
        this.Stipendio = Stipendio;
   }

   public double getstraordinario()
   {
       return Straordinario;
   }
   public void setstraordinario(double Straordinario)
   {
       this.Straordinario = Straordinario;
   }

   public double Paga() 
   {
      return Stipendio + Straordinario;
   }

   public double Paga(int malattia) 
   {
      double p = Stipendio + Straordinario;
      if (malattia > 0) 
      {
          p -= malattia * 15.0; 
      }
      return p;
  }


   public void MostraDettagli() 
   {
      System.out.println("Numero Matricola: " + NumeroMatricola);
      System.out.println("Stipendio: " + Stipendio);
      System.out.println("Straordinario: " + Straordinario);
      System.out.println("paga: " + Paga());
  }
  
  

}