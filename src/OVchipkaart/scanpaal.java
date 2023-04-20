package OVchipkaart;

public class scanpaal
{

  int startrate;
  boolean openports = false;
 
  
  public scanpaal(int startrate) {
      
      
     this.startrate = startrate;
      
  }
   
  
  public void Uitchecken(OVchipkaart Pas)  {
//     Pas.saldo = Pas.saldo - startrate;
     
  boolean transaction = Pas.Uitchecken(30);
  System.out.println("you are checked out");

  if(openports ==true) {
    
   System.out.println("ports open"); 
    System.out.println("ports closed again");
    openports = false;
}
 
//  return transaction;  
//      double cost = saldo - startrate; 
      
  }
  
 public void Inchecken(OVchipkaart Pas) {

     
     
     
     boolean result = Pas.Inchecken(startrate);
     
     if(result == true)
     {
	 System.out.println("you are checked in");
	 openports= true;
	 
	 System.out.println("Ports open");
	 

	  if(openports ==true) {
	    
	    
	    System.out.println("ports closed");
	}
	 
	 
	 
	 
     }
     else {
	 
	 System.out.println("Ports  stay closed");
	 
     }
     
 }
  
  
}
