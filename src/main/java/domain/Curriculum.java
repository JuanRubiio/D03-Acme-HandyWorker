
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Curriculum extends DomainEntity {

	// Atributos ---- 
	private String	ticker;


	@NotBlank
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}


	// Relationships ----

	private PersonalRecord					personalRecord;
	private Collection<EducationalRecord>	educationalRecord;
	private Collection<ProfessionalRecord>	professionalRecords;
	private Collection<EndorserRecord>		endoserRecords;
	private Collection<MiscellaneousRecord>	miscellaneousRecords;


	@Valid
	@NotNull
	@OneToOne(optional = false)
	public PersonalRecord getPersonalRecord() {
		return this.personalRecord;
	}

	public void setPersonalRecord(final PersonalRecord personalRecord) {
		this.personalRecord = personalRecord;
	}

	@Valid
	@NotNull
	@OneToMany(mappedBy = "curriculum", cascade = CascadeType.ALL)
	public Collection<EducationalRecord> getEducationalRecord() {
		return this.educationalRecord;
	}

	public void setEducationalRecord(final Collection<EducationalRecord> edRecord) {
		this.educationalRecord = edRecord;
	}

	@Valid
	@NotNull
	@OneToMany(mappedBy = "curriculum", cascade = CascadeType.ALL)
	public Collection<ProfessionalRecord> getProfessionalRecord() {
		return this.professionalRecords;
	}

	public void setProfessionalRecord(final Collection<ProfessionalRecord> profRecord) {
		this.professionalRecords = profRecord;
	}

	@Valid
	@NotNull
	@OneToMany(mappedBy = "curriculum", cascade = CascadeType.ALL)
	public Collection<EndorserRecord> getEndoserRecords() {
		return this.endoserRecords;
	}

	public void setEndoserRecords(final Collection<EndorserRecord> endRecords) {
		this.endoserRecords = endRecords;
	}

	@Valid
	@NotNull
	@OneToMany(mappedBy = "curriculum", cascade = CascadeType.ALL)
	public Collection<MiscellaneousRecord> getMiscellaneousRecords() {
		return this.miscellaneousRecords;
	}

	public void setMiscellaneousRecords(final Collection<MiscellaneousRecord> misRecords) {
		this.miscellaneousRecords = misRecords;
	}

}
