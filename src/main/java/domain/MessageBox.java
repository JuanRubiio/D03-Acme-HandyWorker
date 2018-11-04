
package domain;

import java.util.Collection;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class MessageBox extends DomainEntity {

	// Atributos ---- 
	private String	name;

	private Boolean	system	= false;


	// Constructor ---- 

	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}
	@NotNull
	public Boolean getSystem() {
		return this.system;
	}

	public void setSystem(final Boolean system) {
		this.system = system;
	}


	// Relationships ----------------------------------------------------------

	private Collection<Message>	messages;
	private Actor				actor;


	@NotNull
	@Valid
	public Collection<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(final Collection<Message> messages) {
		this.messages = messages;
	}

	@NotNull
	@Valid
	public Actor getActor() {
		return this.actor;
	}

	public void setActor(final Actor actor) {
		this.actor = actor;
	}

}
