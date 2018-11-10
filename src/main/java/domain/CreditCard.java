
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

@Embeddable
@Access(AccessType.PROPERTY)
public class CreditCard {

	private String	holderName;
	private String	brandName;
	@Column(unique = true)
	private String	number;
	private Integer	expiryMonth;
	private Integer	expiryYear;
	private Integer	cvv;


	@NotBlank
	public String getHolderName() {
		return this.holderName;
	}

	public void setHolderName(final String holderName) {
		this.holderName = holderName;
	}
	@NotBlank
	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(final String brandName) {
		this.brandName = brandName;
	}
	@CreditCardNumber
	public String getNumber() {
		return this.number;
	}

	public void setNumber(final String number) {
		this.number = number;
	}
	@Range(min = 1, max = 12)
	public Integer getExpiryMonth() {
		return this.expiryMonth;
	}

	public void setExpiryMonth(final Integer expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	@Min(2018)
	public Integer getExpiryYear() {
		return this.expiryYear;
	}

	public void setExpiryYear(final Integer expiryYear) {
		this.expiryYear = expiryYear;
	}
	@Range(min = 100, max = 999)
	public Integer getCvv() {
		return this.cvv;
	}

	public void setCvv(final Integer cvv) {
		this.cvv = cvv;
	}

}
