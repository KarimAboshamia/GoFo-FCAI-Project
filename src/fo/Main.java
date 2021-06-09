package fo;

import java.util.ArrayList;

public class Main {
	
	public static void main(String [] args) {
		ArrayList<ProfileData> printUsers = new ArrayList<ProfileData>();
		SignUpProfile temp = new SignUpProfile();
		temp.signUp("Omar", 123, "omar@gmail.com", 011, "Giza");
		temp.signUp("Omar4", 123, "omar@gmail.com", 011, "Giza");
		LogIn user = new LogIn();
		System.out.println(user.authenticate("omar@gmail.com", 123));
	}
}
