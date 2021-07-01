
public class CareerExpert
{
    public String Advice(String Qualification)
    {
    	if(Qualification.equalsIgnoreCase("BE"))
    	{
    		return "DAC";
    	}
    	else if(Qualification.equalsIgnoreCase("BSC"))
    	{
    		return "DBDA";
    	}
    	return "insert correct input";
    }
}
