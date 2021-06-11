package fo;

import java.util.ArrayList;

public class Player {
	ControlData database = new ControlData();
    private ProfileData obj = new ProfileData();
    private ArrayList<Playground> bookedPlaygrounds = new ArrayList<Playground>();
    Player(){}

    Player(ProfileData info) {
        obj = info;
    }

    public ProfileData getProfileData() {
        return obj;
    }
    
    public void searchForPlayground() {
		for(int i = 0; i < database.fetchOwnersData().get(0).getOwnerPlaygrounds().size(); i++)
		{
			System.out.println("Playground " + (i+1));
			System.out.println("Name:" + database.fetchOwnersData().get(0).getOwnerPlaygrounds().get(i).getName());
			System.out.println("location: " + database.fetchOwnersData().get(0).getOwnerPlaygrounds().get(i).getLocation());
			System.out.println("Size: " + database.fetchOwnersData().get(0).getOwnerPlaygrounds().get(i).getSize());
			System.out.println("Price per hour: " + database.fetchOwnersData().get(0).getOwnerPlaygrounds().get(i).getPricePerHour());
			for(int j = 0; j < database.fetchOwnersData().get(0).getOwnerPlaygrounds().get(i).getAvailableHours().length; j++) {
				if(database.fetchOwnersData().get(0).getOwnerPlaygrounds().get(i).getAvailableHours()[j] == 0) {
					break;
				}
				System.out.println("Time Slots: " + database.fetchOwnersData().get(0).getOwnerPlaygrounds().get(i).getAvailableHours()[j] + " pm");
			}
		}
	}
	
	public boolean book(String name) {
		for(int i = 0; i < database.fetchOwnersData().get(0).getOwnerPlaygrounds().size(); i++)
		{
			if(database.fetchOwnersData().get(0).getOwnerPlaygrounds().get(i).getName().equals(name)) {
				bookedPlaygrounds.add(database.fetchOwnersData().get(0).getOwnerPlaygrounds().get(i));
				System.out.println("Your playground is booked");
				return true;
			}
		}
		System.out.println("This playground isn't available");
		return false;
	}
	
	public ArrayList<Playground> getMyBooking() {
		return bookedPlaygrounds;
	}
}