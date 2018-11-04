
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class Message extends DomainEntity {

	// Atributos ---- 
	private Date				date;

	private Actor				sender;

	private Actor				recipient;

	private String				subject;

	private String				body;

	private String				priority;

	private Boolean				spam	= false;

	private Collection<String>	tags;


	@NotNull
	public Date getDate() {
		return this.date;
	}

	public void setDate(final Date date) {
		this.date = date;
	}
	@NotNull
	@Valid
	public Actor getSender() {
		return this.sender;
	}

	public void setSender(final Actor sender) {
		this.sender = sender;
	}
	@NotNull
	@Valid
	public Actor getRecipient() {
		return this.recipient;
	}

	public void setRecipient(final Actor recipient) {
		this.recipient = recipient;
	}
	@NotNull
	public Boolean getSpam() {
		return this.spam;
	}

	public void setSpam(final Boolean spam) {
		this.spam = spam;
	}

	@NotBlank
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(final String subject) {
		this.subject = subject;
	}

	@NotBlank
	public String getBody() {
		return this.body;
	}

	public void setBody(final String body) {
		this.body = body;
	}

	@NotBlank
	@Pattern(regexp = "HIGH|NEUTRAL|LOW")
	public String getPriority() {
		return this.priority;
	}

	public void setPriority(final String priority) {
		this.priority = priority;
	}


	// Relationships ----------------------------------------------------------

	private Actor					actor;
	private Collection<MessageBox>	messageBoxes;


	@NotNull
	@Valid
	public Actor getActor() {
		return this.actor;
	}

	public void setActor(final Actor actor) {
		this.actor = actor;
	}
	@NotNull
	@Valid
	public Collection<MessageBox> getMessageBoxes() {
		return this.messageBoxes;
	}

	public void setMessageBoxes(final Collection<MessageBox> messageBoxes) {
		this.messageBoxes = messageBoxes;
	}

	@NotEmpty
	public Collection<String> getTags() {
		return this.tags;
	}

	public void setTags(final Collection<String> tags) {
		this.tags = tags;
	}

}
