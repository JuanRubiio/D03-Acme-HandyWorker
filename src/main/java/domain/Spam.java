
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@Access(AccessType.PROPERTY)
public class Spam extends DomainEntity {

	// Atributos ----
	private String	spamWord;


	@NotNull
	public String getSpamWords() {
		return this.spamWord;
	}

	public void setSpamWords(final String spamWords) {
		this.spamWord = spamWords;
	}

	// Constructor ----

}
