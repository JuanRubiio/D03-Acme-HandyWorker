
package domain;

import java.util.Collection;

import javax.validation.constraints.NotNull;

public class Spam extends DomainEntity {

	// Atributos ----
	private Collection<String>	spamWords;


	@NotNull
	public Collection<String> getSpamWords() {
		return this.spamWords;
	}

	public void setSpamWords(final Collection<String> spamWords) {
		this.spamWords = spamWords;
	}

	// Constructor ----

}
