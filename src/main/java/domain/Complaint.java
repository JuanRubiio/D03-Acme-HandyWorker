
package domain;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Complaint extends DomainEntity {

	private String		ticker;
	private Date		moment;
	private String		description;
	private String		attachements;
	//external attributes
	private Referee		referee;
	private Report		report;
	private FixUpTask	fixUpTask;


	@NotBlank
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}
	@NotNull
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}
	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}
	@URL
	public String getAttachements() {
		return this.attachements;
	}

	public void setAttachements(final String attachements) {
		this.attachements = attachements;
	}

	@Valid
	@NotNull
	public Referee getReferee() {
		return this.referee;
	}

	public void setReferee(final Referee referee) {
		this.referee = referee;
	}

	@Valid
	@NotNull
	public Report getReport() {
		return this.report;
	}

	public void setReport(final Report report) {
		this.report = report;
	}

	@Valid
	@NotNull
	public FixUpTask getFixUpTask() {
		return this.fixUpTask;
	}

	public void setFixUpTask(final FixUpTask fixUpTask) {
		this.fixUpTask = fixUpTask;
	}

}
