package fo;

import java.util.ArrayList;

public class SignUpProfile {
	private ProfileData user;
	private ControlData dataBase;
	private int id = 0;
	SignUpProfile() {
		dataBase = new ControlData();
	}
	
	public boolean signUp(String name, int password, String email, int phone, String location) {
		user = new ProfileData();
		id++;
		user.setName(name);
		user.setId(id);
		user.setPassword(password);
		user.setEmail(email);
		user.setPhone(phone);
		user.setLocation(location);
		dataBase.fillUsersDataBase(user);
		return true;		
	}
	
	public ProfileData getUserObject() {
		return user;
	}
	
	public ControlData getControlDataObject() {
		return dataBase;
	}
}
