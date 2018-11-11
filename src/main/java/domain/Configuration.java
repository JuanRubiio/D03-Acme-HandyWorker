
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class Configuration extends DomainEntity {

	// Atributos ---- 
	private String	banner;

	private String	welcomMessage;

	private String	welcomMessageEs;

	private Double	vat;

	private String	countryCode;

	private Integer	finderDuration;

	private String	cards;

	private Integer	maxFiders;

	private Integer	absolutMaxFinders;

	private String	positiveSpanishWords;
	private String	negativeSpanishWords;
	private String	positiveEnglishWords;
	private String	negativeEnglishWords;


	@NotNull
	@Range(min = 60, max = 1440)
	public Integer getFinderDuration() {
		return this.finderDuration;
	}

	public void setFinderDuration(final Integer finderDuration) {
		this.finderDuration = finderDuration;
	}

	@URL
	public String getBanner() {
		return this.banner;
	}

	public void setBanner(final String banner) {
		this.banner = banner;
	}

	@NotBlank
	public String getWelcomMessage() {
		return this.welcomMessage;
	}

	public void setWelcomMessage(final String welcomMessage) {
		this.welcomMessage = welcomMessage;
	}

	@NotBlank
	public String getWelcomMessageEs() {
		return this.welcomMessageEs;
	}

	public void setWelcomMessageEs(final String welcomMessageEs) {
		this.welcomMessageEs = welcomMessageEs;
	}

	@NotNull
	@Min(1)
	public Double getVat() {
		return this.vat;
	}

	public void setVat(final Double vat) {
		this.vat = vat;
	}

	@NotBlank
	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(final String countryCode) {
		this.countryCode = countryCode;
	}

	@NotBlank
	public String getCards() {
		return this.cards;
	}

	public void setCards(final String cards) {
		this.cards = cards;
	}

	@NotNull
	@Range(min = 0, max = 10)
	public Integer getMaxFiders() {
		return this.maxFiders;
	}

	public void setMaxFiders(final Integer maxFiders) {
		this.maxFiders = maxFiders;
	}

	@NotNull
	@Range(min = 0, max = 100)
	public Integer getAbsolutMaxFinders() {
		return this.absolutMaxFinders;
	}

	public void setAbsolutMaxFinders(final Integer absolutMaxFinders) {
		this.absolutMaxFinders = absolutMaxFinders;
	}

	@NotBlank
	public String getPositiveSpanishWords() {
		return this.positiveSpanishWords;
	}

	public void setPositiveSpanishWords(final String positiveSpanishWords) {
		this.positiveSpanishWords = positiveSpanishWords;
	}

	@NotBlank
	public String getNegativeSpanishWords() {
		return this.negativeSpanishWords;
	}

	public void setNegativeSpanishWords(final String negativeSpanishWords) {
		this.negativeSpanishWords = negativeSpanishWords;
	}

	@NotBlank
	public String getPositiveEnglishWords() {
		return this.positiveEnglishWords;
	}

	public void setPositiveEnglishWords(final String positiveEnglishWords) {
		this.positiveEnglishWords = positiveEnglishWords;
	}

	@NotBlank
	public String getNegativeEnglishWords() {
		return this.negativeEnglishWords;
	}

	public void setNegativeEnglishWords(final String negativeEnglishWords) {
		this.negativeEnglishWords = negativeEnglishWords;
	}

}
