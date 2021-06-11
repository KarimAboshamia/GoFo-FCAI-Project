package fo;


public class SignUpProfile {
    private ProfileData user;
    private Player player;
    private ControlData dataBase;
    private int id = 0;
    SignUpProfile() {
        dataBase = new ControlData();
    }

    public boolean signUp(String name, String password, String email, String phone, String location) {
        user = new ProfileData();
        id++;
        user.setName(name);
        user.setId(id);
        user.setPassword(password);
        user.setEmail(email);
        user.setPhone(phone);
        user.setLocation(location);
        player = new Player(user);
        dataBase.fillPlayersDataBase(player);
        return true;
    }

    public ProfileData getUserObject() {
        return user;
    }

    public ControlData getControlDataObject() {
        return dataBase;
    }
}
