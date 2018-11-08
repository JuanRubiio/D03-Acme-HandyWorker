
package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Endorsement extends DomainEntity {

	private Date	moment;
	private String	comment;


	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	public String getComment() {
		return this.comment;
	}

	public void setComment(final String comment) {
		this.comment = comment;
	}


	//Relationship 
	private Endorser	writeFrom;
	private Endorser	writeTo;


	@NotNull
	@Valid
	@ManyToOne(optional = false)
	public Endorser getWriteFor() {
		return this.writeFrom;
	}

	public void setWriteFor(final Endorser writeFrom) {
		this.writeFrom = writeFrom;
	}

	@NotNull
	@Valid
	@ManyToOne(optional = false)
	public Endorser getWriteTo() {
		return this.writeTo;
	}

	public void setWriteTo(final Endorser writeTo) {
		this.writeTo = writeTo;
	}

}
