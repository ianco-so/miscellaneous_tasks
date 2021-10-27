package tarefa11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String name;
	private String email;
	private Date birthDate;
	
	protected Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
	
	protected String getName() {	return name;}
	protected void setName(String name) {	this.name = name;}
	protected String getEmail() {	return email;}
	protected void setEmail(String email) {	this.email = email;}
	protected Date getBirthDate() {	return birthDate;}
	protected void setBirthDate(Date birthDate) {	this.birthDate = birthDate;}

	public String toString() {	return getName() + "("+sdf.format(getBirthDate())+ ") - " + getEmail();}
}
