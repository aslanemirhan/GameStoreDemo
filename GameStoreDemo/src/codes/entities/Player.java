package codes.entities;

import java.time.LocalDate;

public class Player {

	private int playerId;
	private String firstName;
	private String lastname;
	private String nationalityId;
	private LocalDate dateOfBirth;
	
	public Player() {}

	public Player(int playerId, String firstName, String lastname, String nationalityId, LocalDate dateOfBirth) {
		super();
		this.playerId = playerId;
		this.firstName = firstName;
		this.lastname = lastname;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
	
}
