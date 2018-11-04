
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class Apply extends DomainEntity {

	//----------Atributos------------
	private Date	moment;
	private String	status;
	private String	customerComment;
	private Double	price;
	private String	handyWorkerComments;


	//----------Getters & Setters-----------
	@NotNull
	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	@Pattern(regexp = "PENDING|REJECTED|ACCEPTED")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	@NotBlank
	public String getCustomerComment() {
		return this.customerComment;
	}

	public void setCustomerComment(final String customerComment) {
		this.customerComment = customerComment;
	}

	@NotNull
	@Digits(integer = 4, fraction = 2)
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(final Double price) {
		this.price = price;
	}

	@NotBlank
	public String getHandyWorkerComments() {
		return this.handyWorkerComments;
	}

	public void setHandyWorkerComments(final String handyWorkerComments) {
		this.handyWorkerComments = handyWorkerComments;
	}


	//------RelationsShip-----------
	private HandyWorker			handyWorker;
	private Collection<Phase>	workplan;
	private FixUpTask			fixUpTask;


	@NotNull
	@Valid
	public HandyWorker getHandyWorker() {
		return this.handyWorker;
	}

	public void setHandyWorker(final HandyWorker handyWorker) {
		this.handyWorker = handyWorker;
	}

	@NotEmpty
	@Valid
	public Collection<Phase> getWorkPlan() {
		return this.workplan;
	}

	public void setWorkPlan(final Collection<Phase> workplan) {
		this.workplan = workplan;
	}

	@NotNull
	@Valid
	public FixUpTask getFixUpTask() {
		return this.fixUpTask;
	}

	public void setFixUpTask(final FixUpTask fixUpTask) {
		this.fixUpTask = fixUpTask;
	}

}
