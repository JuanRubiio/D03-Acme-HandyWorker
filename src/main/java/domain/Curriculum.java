
package domain;

import java.util.Collection;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

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
	private HandyWorker						handyWorker;


	@Valid
	@NotNull
	public PersonalRecord getPersonalRecord() {
		return this.personalRecord;
	}

	public void setPersonalRecord(final PersonalRecord personalRecord) {
		this.personalRecord = personalRecord;
	}

	@Valid
	@NotNull
	public Collection<EducationalRecord> getEducationalRecord() {
		return this.educationalRecord;
	}

	public void setEducationalRecord(final Collection<EducationalRecord> edRecord) {
		this.educationalRecord = edRecord;
	}

	@Valid
	@NotNull
	public Collection<ProfessionalRecord> getProfessionalRecord() {
		return this.professionalRecords;
	}

	public void setProfessionalRecord(final Collection<ProfessionalRecord> profRecord) {
		this.professionalRecords = profRecord;
	}

	@Valid
	@NotNull
	public Collection<EndorserRecord> getEndoserRecords() {
		return this.endoserRecords;
	}

	public void setEndoserRecords(final Collection<EndorserRecord> endRecords) {
		this.endoserRecords = endRecords;
	}

	@Valid
	@NotNull
	public Collection<MiscellaneousRecord> getMiscellaneousRecords() {
		return this.miscellaneousRecords;
	}

	public void setMiscellaneousRecords(final Collection<MiscellaneousRecord> misRecords) {
		this.miscellaneousRecords = misRecords;
	}

	@Valid
	@NotNull
	public HandyWorker getRanger() {
		return this.handyWorker;
	}

	public void setHandyWorker(final HandyWorker handyWorker) {
		this.handyWorker = handyWorker;
	}

}
