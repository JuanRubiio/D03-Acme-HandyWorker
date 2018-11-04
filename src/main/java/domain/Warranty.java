
package domain;

import java.util.Collection;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class Warranty extends DomainEntity {

	private String	title;
	private String	terms;
	private String	laws;
	private Boolean	draft;


	@NotNull
	public Boolean getDraft() {
		return this.draft;
	}

	public void setDraft(final Boolean draft) {
		this.draft = draft;
	}

	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@NotBlank
	public String getTerms() {
		return this.terms;
	}

	public void setTerms(final String terms) {
		this.terms = terms;
	}

	@NotBlank
	public String getLaws() {
		return this.laws;
	}

	public void setLaws(final String laws) {
		this.laws = laws;
	}


	//Relationship

	private Collection<FixUpTask>	task;


	@NotNull
	@Valid
	public Collection<FixUpTask> getTask() {
		return this.task;
	}

	public void setTask(final Collection<FixUpTask> task) {
		this.task = task;
	}

}
