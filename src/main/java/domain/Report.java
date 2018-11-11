
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Report extends DomainEntity {

	private Date				moment;
	private String				description;
	private String				attachements;
	private Boolean				draft;

	private Collection<Note>	collectionNotes;
	private Referee				referee;


	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@Valid
	@OneToMany(mappedBy = "report", cascade = CascadeType.ALL)
	public Collection<Note> getCollectionNotes() {
		return this.collectionNotes;
	}

	public void setCollectionNotes(final Collection<Note> collectionNotes) {
		this.collectionNotes = collectionNotes;
	}

	@Valid
	@NotNull
	@ManyToOne(optional = false)
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

	public String getAttachements() {
		return this.attachements;
	}

	public void setAttachements(final String attachements) {
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
