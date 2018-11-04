/*
 * Actor.java
 * 
 * Copyright (C) 2017 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the
 * TDG Licence, a copy of which you may download from
 * http://www.tdg-seville.info/License.html
 */

package domain;

import java.util.Collection;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

import security.UserAccount;

public abstract class Actor extends DomainEntity {

	// Attributes -------------------------------------------------------------

	private String	name;
	private String	surname;
	private String	middleName;
	private String	email;
	private String	phone;
	private String	address;
	private String	photo;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(final String middleName) {
		this.middleName = middleName;
	}

	@NotBlank
	public String getSurname() {
		return this.surname;
	}

	public void setSurname(final String surname) {
		this.surname = surname;
	}

	@URL
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(final String photo) {
		this.photo = photo;
	}

	@Email
	@NotBlank
	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	@NotBlank
	@Pattern(regexp = "(\\+\\d{1,3})?(\\(\\d{1,3}\\))?(\\w{4,})?")
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(final String phone) {
		this.phone = phone;
	}

	@NotBlank
	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}


	// Relationships ----------------------------------------------------------

	private Collection<MessageBox>		messageBoxes;
	private Collection<Message>			messages;
	private Collection<SocialProfile>	socialProfiles;
	private UserAccount					userAccount;


	@NotNull
	@Valid
	public UserAccount getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(final UserAccount userAccount) {
		this.userAccount = userAccount;
	}
	@NotNull
	@Valid
	public Collection<MessageBox> getMessageBoxes() {
		return this.messageBoxes;
	}

	public void setMessageBoxes(final Collection<MessageBox> messageBoxes) {
		this.messageBoxes = messageBoxes;
	}
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
	public Collection<SocialProfile> getSocialProfiles() {
		return this.socialProfiles;
	}

	public void setSocialProfiles(final Collection<SocialProfile> socialProfiles) {
		this.socialProfiles = socialProfiles;
	}

}
