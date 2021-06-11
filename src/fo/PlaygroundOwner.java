package fo;
import java.util.ArrayList;

public class PlaygroundOwner extends Player {
	private int idPlayground = 0;
    private ArrayList<Playground> eachOwnerPlaygrounds = new ArrayList<Playground>();
    private ControlData database = new ControlData();
    PlaygroundOwner(ProfileData profile) {
        super(profile);
    }
    
    public void registerPlayground(String name, String location, int size, int avaHours[], float price, int cancelPeriod) {
		idPlayground++;
		Playground ownerPlayground = new Playground(idPlayground, name, location, size, avaHours, price, cancelPeriod);
		eachOwnerPlaygrounds.add(ownerPlayground);
		database.fillPlaygroundsOwners(this);
	}
	
	public ArrayList<Playground> getOwnerPlaygrounds(){
		return eachOwnerPlaygrounds;
	}
}
