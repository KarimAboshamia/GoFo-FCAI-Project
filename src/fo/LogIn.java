package fo;

public class LogIn {
	
	ControlData usersData = new ControlData();
	public boolean authenticate(String email, int password) {
		for(int i = 0; i <usersData.fetchData().size();i++)
		{
			if(email == usersData.fetchData().get(i).getEmail() && password == usersData.fetchData().get(i).getPassword()) {
				return true;
			}
		}
		return false;
	}
}
