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

}
