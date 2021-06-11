package fo;


//Since Java doesn't support Struct we will use a class as a Struct 
public class Playground {
	private int id;
	private String name;
	private String location;
	private int size;
	private int availableHours[];
	private float pricePerHour;
	private int cancelPeriod;
	private boolean approaved;
	Playground(){}
	Playground(int id, String name, String location, int size, int availableHours[], float pricePerHour, int cancelPeriod){
		this.id = id;
		this.name = name;
		this.location = location;
		this.size = size;
		this.availableHours = availableHours;
		this.pricePerHour = pricePerHour;
		this.cancelPeriod = cancelPeriod;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int[] getAvailableHours() {
		return availableHours;
	}
	public void setAvailableHours(int availableHours[]) {
		this.availableHours = availableHours;
	}
	public int getCancelPeriod() {
		return cancelPeriod;
	}
	public void setCancelPeriod(int cancelPeriod) {
		this.cancelPeriod = cancelPeriod;
	}
	public boolean isApproaved() {
		return approaved;
	}
	public void setApproaved(boolean approaved) {
		this.approaved = approaved;
	}
	public float getPricePerHour() {
		return pricePerHour;
	}
	public void setPricePerHour(float pricePerHour) {
		this.pricePerHour = pricePerHour;
	}
	

}
