package fo;

public class LogIn {

    ControlData usersData = new ControlData();
    public ProfileData authenticate(String email, String password) {
        for(int i = 0; i < usersData.fetchPlayersData().size();i++)
        {
            if(email.equals(usersData.fetchPlayersData().get(i).getProfileData().getEmail()) && password.equals(usersData.fetchPlayersData().get(i).getProfileData().getPassword())){
                return usersData.fetchPlayersData().get(0).getProfileData();
            }
        }
        return null;
    }
}