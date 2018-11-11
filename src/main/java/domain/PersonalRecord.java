
package domain;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class PersonalRecord extends DomainEntity {

	// Atributos ----
	private String	name;

	private String	photo;

	private String	email;

	private String	phoneNumber;

	private String	linkedinIdProfile;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@URL
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(final String photo) {
		this.photo = photo;
	}

	@Email
	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	@NotBlank
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(final String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@URL
	public String getLinkedinIdProfile() {
		return this.linkedinIdProfile;
	}

	public void setLinkedinIdProfile(final String linkedinIdProfile) {
		this.linkedinIdProfile = linkedinIdProfile;
	}


	// Relationships ----

	private Curriculum	curriculum;


	@Valid
	@NotNull
	public Curriculum getCurriculum() {
		return this.curriculum;
	}

	public void setCurriculum(final Curriculum aux) {
		this.curriculum = aux;
	}

}
