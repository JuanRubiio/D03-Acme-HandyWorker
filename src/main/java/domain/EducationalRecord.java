
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

public class EducationalRecord extends DomainEntity {

	// Atributos ---- 
	private String				title;

	private Date				begin;

	private Date				end;

	private String				institution;

	private String				attachment;

	private Collection<String>	comments;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@NotNull
	@Past
	public Date getBegin() {
		return this.begin;
	}

	public void setBegin(final Date begin) {
		this.begin = begin;
	}

	@NotNull
	public Date getEnd() {
		return this.end;
	}

	public void setEnd(final Date end) {
		this.end = end;
	}

	@NotBlank
	public String getInstitution() {
		return this.institution;
	}

	public void setInstitution(final String institution) {
		this.institution = institution;
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
