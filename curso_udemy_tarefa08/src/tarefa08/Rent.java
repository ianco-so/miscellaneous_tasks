package tarefa08;

public class Rent {
	private String name, email;
	private final Integer roomNumber;
	protected static Boolean [] room = new Boolean [10];

	protected Rent (String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room[room] = true;
		this.roomNumber = room;
	}
	
	protected String getName() { return name;}
	protected void setName(String name) { this.name = name;}
	protected String getEmail() { return email;}
	protected void setEmail(String email) { this.email = email;}
	protected Integer getRoomNumber() { return roomNumber;}
	
	public String toString() { return "Rent [name=" + name + ", email=" + email + "]";}
}
