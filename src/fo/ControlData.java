package fo;

import java.util.ArrayList;

//This class mimic having database
public class ControlData {
    static ArrayList<PlaygroundOwner> playgroundsOwners = new ArrayList<PlaygroundOwner>();
    static ArrayList<Player> players = new ArrayList<Player>();

    ControlData(){}

    public void fillPlayersDataBase(Player temp) {
        this.players.add(temp);
    }

    public void fillPlaygroundsOwners(PlaygroundOwner owner) {
        int index = owner.getProfileData().getId()-1;
        this.playgroundsOwners.add(index, owner);
    }

    public ArrayList<PlaygroundOwner> fetchOwnersData() {
        return playgroundsOwners;
    }

    public ArrayList<Player> fetchPlayersData() {
        return players;
    }
}