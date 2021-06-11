package fo;
import java.util.ArrayList;

public class PlaygroundOwner extends Player {
	private int idPlayground = 0;
    private ArrayList<Playground> eachOwnerPlaygrounds = new ArrayList<Playground>();
    private ControlData database = new ControlData();
    PlaygroundOwner(ProfileData profile) {
        super(profile);
    }
}
