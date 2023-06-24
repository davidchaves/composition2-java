package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
	
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private String name;
	private String email;
	private LocalDate brithDate;
	
	public Client() {
		
	}

	public Client(String name, String email, LocalDate brithDate) {
		this.name = name;
		this.email = email;
		this.brithDate = brithDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBrithDate() {
		return brithDate;
	}

	public void setBrithDate(LocalDate brithDate) {
		this.brithDate = brithDate;
	}
	
	@Override
	public String toString() {
		return name + " (" + fmt1.format(brithDate) + ") - " + email;
	}
}

