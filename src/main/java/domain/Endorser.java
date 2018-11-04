
package domain;

import java.util.Collection;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Endorser extends Actor {

	private Collection<Endorsement>	endorsement;


	@NotNull
	@Valid
	public Collection<Endorsement> getEndorsement() {
		return this.endorsement;
	}

	public void setEndorsement(final Collection<Endorsement> endorsement) {
		this.endorsement = endorsement;
	}

}
