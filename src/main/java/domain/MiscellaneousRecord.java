
package domain;

import java.util.Collection;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

public class MiscellaneousRecord extends DomainEntity {

	// Atributos ---- 
	private String				title;

	private String				attachment;

	private Collection<String>	comments;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
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
