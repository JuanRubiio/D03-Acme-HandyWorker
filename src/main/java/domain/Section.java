
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Section extends DomainEntity {

	private String				title;
	private String				text;
	private Collection<String>	pictures;
	private Integer				order;

	//external attributes
	private Tutorial			tutorial;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}
	@NotBlank
	public String getText() {
		return this.text;
	}

	public void setText(final String text) {
		this.text = text;
	}
	@NotNull
	public Collection<String> getPictures() {
		return this.pictures;
	}

	public void setPictures(final Collection<String> pictures) {
		this.pictures = pictures;
	}
	@NotNull
	public Integer getOrder() {
		return this.order;
	}

	public void setOrder(final Integer order) {
		this.order = order;
	}

	@Valid
	@NotNull
	@ManyToOne(optional = false)
	public Tutorial getTutorial() {
		return this.tutorial;
	}

	public void setTutorial(final Tutorial tutorial) {
		this.tutorial = tutorial;
	}

}
