
public class LoginBean {

	public boolean validate(String uname,String pass)
	{
		if(uname.equalsIgnoreCase("Lucy")&& pass.equals("saurabh"))
		{
			return true;
		}
		return false;
	}

}
