package OVchipkaart;

import java.util.Scanner;

public class opwaardeerpaal
{

  double saldo;
  int id;
  double tarief;
  
  
  
  public double Opwaarderen( OVchipkaart pas)  {
      
      
      
      
      
       Scanner sc = new Scanner(System.in);
       
      
     double tarief = sc.nextDouble();
     double geld = tarief + pas.saldo;
     pas.saldo = geld;
     
     
      
      
      
      
      return saldo;
      
      
  }
  
    
    
    
    
    
}
