
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class Tutorial extends DomainEntity {

	private String					title;
	private Date					momentUpdate;
	private String					summary;
	private Collection<String>		pictures;
	private Date					momentCreate;

	//external attributes
	private Collection<Section>		section;
	private Collection<Sponsorship>	sponsorships;
	private HandyWorker				handyWorker;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public Date getMomentUpdate() {
		return this.momentUpdate;
	}

	public void setMomentUpdate(final Date momentUpdate) {
		this.momentUpdate = momentUpdate;
	}
	@NotBlank
	public String getSummary() {
		return this.summary;
	}

	public void setSummary(final String summary) {
		this.summary = summary;
	}
	@NotNull
	public Collection<String> getPictures() {
		return this.pictures;
	}

	public void setPictures(final Collection<String> pictures) {
		this.pictures = pictures;
	}

	@NotNull
	public Date getMomentCreate() {
		return this.momentCreate;
	}

	public void setMomentCreate(final Date momentCreate) {
		this.momentCreate = momentCreate;
	}

	@Valid
	@NotEmpty
	public Collection<Section> getSection() {
		return this.section;
	}

	public void setSection(final Collection<Section> section) {
		this.section = section;
	}

	@NotNull
	@Valid
	public Collection<Sponsorship> getSponsorship() {
		return this.sponsorships;
	}

	public void setSponsorship(final Collection<Sponsorship> sponsorship) {
		this.sponsorships = sponsorship;
	}

	@Valid
	@NotNull
	public HandyWorker getHandyWorker() {
		return this.handyWorker;
	}

	public void setHandyWorker(final HandyWorker handyWorker) {
		this.handyWorker = handyWorker;
	}

}
