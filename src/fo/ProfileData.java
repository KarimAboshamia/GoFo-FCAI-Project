package fo;

import java.util.ArrayList;

//Since Java doesn't support Struct we will use a class as a Struct
public class ProfileData {
	private String name;
	private int id;
	private int password;
	private String email;
	private int phone;
	private String location;
	private ArrayList<Playground> bookedPlaygrounds = new ArrayList<Playground>();
	ProfileData(){}
	ProfileData(String name, int id, int password, String email, int phone, String location){
		this.name = name;
		this.id = id;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public ArrayList<Playground> getBookedPlaygrounds() {
		return bookedPlaygrounds;
	}
	public void setBookedPlaygrounds(Playground bookedPlaygrounds) {
		this.bookedPlaygrounds.add(bookedPlaygrounds);
	}
	
}
