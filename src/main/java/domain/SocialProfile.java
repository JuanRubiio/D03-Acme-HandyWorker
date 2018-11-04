
package domain;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class SocialProfile extends DomainEntity {

	// Attributes -------------------------------------------------------------

	private String	nik;
	private String	socialName;
	private String	link;
	private Actor	actor;


	@NotBlank
	public String getNik() {
		return this.nik;
	}

	public void setNik(final String nik) {
		this.nik = nik;
	}

	@NotBlank
	public String getSocialName() {
		return this.socialName;
	}

	public void setSocialName(final String socialName) {
		this.socialName = socialName;
	}

	@URL
	public String getLink() {
		return this.link;
	}

	public void setLink(final String link) {
		this.link = link;
	}

	// Relationships ----------------------------------------------------------
	@NotNull
	@Valid
	public Actor getActor() {
		return this.actor;
	}

	public void setActor(final Actor actor) {
		this.actor = actor;
	}

}
