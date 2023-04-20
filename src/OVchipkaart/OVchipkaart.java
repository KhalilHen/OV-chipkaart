package OVchipkaart;

public class OVchipkaart
{
     int OVcard;	
    int ChipId;
    double saldo;
    boolean Checkin = false;
    
    
    public OVchipkaart(double saldo) {
	
	this.saldo = saldo;
	
	
    }
    
    public boolean  Uitchecken(double rate)
    {
	
	
	
	
	
	 saldo = saldo - rate;
	Checkin = false;
	return Checkin;
	
	
    }
    
    
    

    public boolean Inchecken(int startrate)
    {
	
	
	
	if(saldo >= startrate) {
	    
	    
	    Checkin = true;
	}

	if (Checkin == true)
	{
	    
	    return true;
//	    System.out.println("U are check in");
 
	} else
	{
	    
	    return false;
//	    System.out.println("U are checked out");

	}

    }

}
