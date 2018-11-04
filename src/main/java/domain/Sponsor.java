
package domain;

import java.util.Collection;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Sponsor extends Actor {

	private Collection<Sponsorship>	sponsorShip;


	@NotNull
	@Valid
	public Collection<Sponsorship> getSponsorShip() {
		return this.sponsorShip;
	}

	public void setSponsorShip(final Collection<Sponsorship> sponsorShip) {
		this.sponsorShip = sponsorShip;
	}

}
