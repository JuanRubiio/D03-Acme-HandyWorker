
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class FixUpTask extends DomainEntity {

	//---------Atributos------------
	private String	ticker;
	private Date	moment;
	private String	description;
	private String	address;
	private Double	maxPrice;
	private Date	maxDate;
	private Date	minDate;


	//--------Getters & Setters-------------------

	@NotBlank
	@Pattern(regexp = "\\d{6}-[A-Z] {4}")
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

	@NotBlank
	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}
	@Digits(integer = 4, fraction = 2)
	@NotNull
	public Double getMaxPrice() {
		return this.maxPrice;
	}

	public void setMaxPrice(final Double maxPrice) {
		this.maxPrice = maxPrice;
	}

	@NotNull
	public Date getMaxDate() {
		return this.maxDate;
	}

	public void setMaxDate(final Date maxDate) {
		this.maxDate = maxDate;
	}

	@NotNull
	public Date getMinDate() {
		return this.minDate;
	}

	public void setMinDate(final Date minDate) {
		this.minDate = minDate;
	}


	//-------------RelationShip------------------

	private Customer				customer;
	private Collection<Complaint>	complaint;
	private Warranty				warranty;
	private Category				category;
	private Collection<Finder>		finder;
	private Collection<Apply>		apply;


	@NotNull
	@Valid
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}

	@NotNull
	@Valid
	public Collection<Complaint> getComplaint() {
		return this.complaint;
	}

	public void setComplaint(final Collection<Complaint> complaint) {
		this.complaint = complaint;
	}

	@NotNull
	@Valid
	public Warranty getWarranty() {
		return this.warranty;
	}

	public void setWarranty(final Warranty warranty) {
		this.warranty = warranty;
	}

	@NotNull
	@Valid
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(final Category category) {
		this.category = category;
	}

	@NotEmpty
	@Valid
	public Collection<Finder> getFinder() {
		return this.finder;
	}

	public void setFinder(final Collection<Finder> finder) {
		this.finder = finder;
	}

	@NotNull
	@Valid
	public Collection<Apply> getApply() {
		return this.apply;
	}

	public void setApply(final Collection<Apply> apply) {
		this.apply = apply;
	}

}
