
package domain;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class Endorsement extends DomainEntity {

	private Date		moment;
	private String		comment;
	private Endorser	writeTo;
	private Endorser	writeFor;


	@NotNull
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
	@NotNull
	@Valid
	public Endorser getWriteTo() {
		return this.writeTo;
	}

	public void setWriteTo(final Endorser writeTo) {
		this.writeTo = writeTo;
	}
	@NotNull
	@Valid
	public Endorser getWriteFor() {
		return this.writeFor;
	}

	public void setWriteFor(final Endorser writeFor) {
		this.writeFor = writeFor;
	}

}
