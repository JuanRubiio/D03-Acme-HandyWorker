
package domain;

import java.util.Collection;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

public class EndorserRecord extends DomainEntity {

	// Atributos ---- 
	private String				name;

	private String				email;

	private String				phoneNumber;

	private String				attachment;

	private Collection<String>	comments;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Email
	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	@NotBlank
	@Pattern(regexp = "(\\+\\d{1,3})?(\\(\\d{1,3}\\))?(\\w{4,})?")
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(final String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@URL
	public String getAttachment() {
		return this.attachment;
	}

	public void setAttachment(final String attachment) {
		this.attachment = attachment;
	}

	@NotEmpty
	public Collection<String> getComments() {
		return this.comments;
	}

	public void setComments(final Collection<String> comments) {
		this.comments = comments;
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
