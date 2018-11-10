package domain;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity
@Access(AccessType.PROPERTY)
public class EndorserRecord extends DomainEntity {

	// Atributos ---- 
	private String	name;

	private String	email;

	private String	phoneNumber;
	
	private String attachment;
	
	private String comments;


	@NotBlank
	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Email
	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	@NotBlank
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(final String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public String getAttachment(){
		return attachment;
	}
	
	public void setAttachment(final String attachment){
		this.attachment = attachment;
	}
	
	public String getComments() {
		return comments;
	}

	public void setComments(final String comments) {
		this.comments = comments;
	}
// Relationships ----

	private Curriculum curriculum;

	@Valid
	@NotNull
	@ManyToOne(optional=false, cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	public Curriculum getCurriculum(){
		return curriculum;
	}
	
	public void setCurriculum(final Curriculum aux){
		curriculum=aux;
	}

}
