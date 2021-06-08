package fo;

import java.util.ArrayList;

//This class mimic having database
public class ControlData {
	ArrayList<SignUpProfile> playgroundUsers = new ArrayList<SignUpProfile>();
	ArrayList<PlaygroundOwner> playgroundsOwners = new ArrayList<PlaygroundOwner>();
	static ArrayList<ProfileData> users = new ArrayList<ProfileData>();
	ControlData(){}
	public void fillUsersDataBase(ProfileData profile) {
		this.users.add(profile);
	}
	
	public ArrayList<ProfileData> fetchData() {
		return users;
	}
	

}
