
package domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Phase extends DomainEntity {

	//--------Atributos-------
	private String	title;
	private String	description;
	private Date	startMoment;
	private Date	endMoment;
	private Integer	ordered;


	//-------Getter & Setter---------
	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@NotNull
	public Date getStartMoment() {
		return this.startMoment;
	}

	public void setStartMoment(final Date startMoment) {
		this.startMoment = startMoment;
	}

	@NotNull
	public Date getEndMoment() {
		return this.endMoment;
	}

	public void setEndMoment(final Date endMoment) {
		this.endMoment = endMoment;
	}

	@NotNull
	public Integer getOrdered() {
		return this.ordered;
	}

	public void setOrdered(final Integer ordered) {
		this.ordered = ordered;
	}


	//----------RelationShips------
	private Apply	apply;


	@NotNull
	@Valid
	public Apply getApply() {
		return this.apply;
	}

	public void setApply(final Apply apply) {
		this.apply = apply;
	}

}
