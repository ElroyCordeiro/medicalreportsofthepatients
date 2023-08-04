package Maven;

import java.util.ResourceBundle;

public class swiggyapp {
	
		public int userLogin(String in_user, String pwd, String in_location )
		{
			ResourceBundle rb=ResourceBundle.getBundle("config");
			String userName=rb.getString("username");
			String password=rb.getString("password");
			String location=rb.getString("location");
			
			if(in_user.equals(userName) && pwd.equals(password) && location.equals(location))
				return 1;
			else
			return 0;
			
	}
}
