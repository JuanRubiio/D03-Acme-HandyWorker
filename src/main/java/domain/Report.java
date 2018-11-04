
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class Report extends DomainEntity {

	private Date				moment;
	private String				description;
	private Collection<String>	attachements;
	private Boolean				draft;

	private Collection<Note>	collectionNotes;
	private Complaint			complaint;
	private Referee				referee;


	@NotNull
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotNull
	@Valid
	public Collection<Note> getCollectionNotes() {
		return this.collectionNotes;
	}

	public void setCollectionNotes(final Collection<Note> collectionNotes) {
		this.collectionNotes = collectionNotes;
	}

	@Valid
	@NotNull
	public Complaint getComplaint() {
		return this.complaint;
	}

	public void setComplaint(final Complaint complaint) {
		this.complaint = complaint;
	}

	@Valid
	@NotNull
	public Referee getReferee() {
		return this.referee;
	}

	public void setReferee(final Referee referee) {
		this.referee = referee;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@NotEmpty
	public Collection<String> getAttachements() {
		return this.attachements;
	}

	public void setAttachements(final Collection<String> attachements) {
		this.attachements = attachements;
	}

	@NotNull
	public Boolean getDraft() {
		return this.draft;
	}

	public void setDraft(final Boolean draft) {
		this.draft = draft;
	}

}
