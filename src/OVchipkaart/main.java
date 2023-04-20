package OVchipkaart; 

public class main
{

    public static void main(String[] args)
    {
//	if(opwaarderen == true)
//	{
//	OVchipkaart ov1 = new OVchipkaart(double tarief);
//
//	}
//	
//	Opwaarderen opwaardeer = new Opwaarderen();
	opwaardeerpaal  opladen = new opwaardeerpaal();
	
	

	OVchipkaart ov1 = new OVchipkaart(0);
	
	scanpaal paal = new scanpaal(15);
	
	opladen.Opwaarderen(ov1);
	
	
	paal.Inchecken(ov1);
	
	paal.Uitchecken(ov1);
	
	
    }

}
;