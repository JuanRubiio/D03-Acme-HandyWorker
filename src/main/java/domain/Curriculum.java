package domain;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Access(AccessType.PROPERTY)
public class Curriculum extends DomainEntity {

	// Atributos ---- 
	private String	ticker;

	@NotBlank
	public String getTicker() {
		return ticker;
	}
	
	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}
	
	// Relationships ----
	
	private PersonalRecord personalRecord;
	private Collection<EducationalRecord> educationalRecord ;
	private Collection<ProfessionalRecord> professionalRecords ;
	private Collection<EndorserRecord> endoserRecords;
	private Collection<MiscellaneousRecord> miscellaneousRecords;
	private HandyWorker handyWorker;

	@Valid
	@NotNull
	@OneToOne(optional=false)
	public PersonalRecord getPersonalRecord(){
		return personalRecord;
	}
	
	public void setPersonalRecord(final PersonalRecord personalRecord){
		this.personalRecord = personalRecord;
	}
	
	@Valid
	@NotNull
	@OneToMany(mappedBy="EducationalRecord", cascade=CascadeType.ALL)
	public Collection<EducationalRecord> getEducationalRecord(){
		return educationalRecord;
	}
	
	public void setEducationalRecord(final Collection<EducationalRecord> edRecord){
		educationalRecord = edRecord;
	}

	@Valid
	@NotNull
	@OneToMany(mappedBy="EducationalRecord", cascade=CascadeType.ALL)
	public Collection<ProfessionalRecord> getProfessionalRecord(){
		return professionalRecords;
	}
	
	public void setProfessionalRecord(final Collection<ProfessionalRecord> profRecord){
		professionalRecords = profRecord;
	}
	
	@Valid
	@NotNull
	@OneToMany(mappedBy="EducationalRecord", cascade=CascadeType.ALL)
	public Collection<EndorserRecord> getEndoserRecords(){
		return endoserRecords;
	}
	
	
	public void setEndoserRecords(final Collection<EndorserRecord> endRecords){
		endoserRecords = endRecords;
	}
	
	@Valid
	@NotNull
	@OneToMany(mappedBy="EducationalRecord", cascade=CascadeType.ALL)
	public Collection<MiscellaneousRecord> getMiscellaneousRecords(){
		return miscellaneousRecords;
	}
	
	public void setMiscellaneousRecords(final Collection<MiscellaneousRecord> misRecords){
		miscellaneousRecords = misRecords;
	}

	@Valid
	@NotNull
	@OneToOne(optional=false)
	public HandyWorker getRanger(){
		return handyWorker;
	}
	
	public void setHandyWorker(final HandyWorker handyWorker){
		this.handyWorker = handyWorker;
	}
		
}
