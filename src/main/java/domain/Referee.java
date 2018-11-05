
package domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.Valid;

@Entity
public class Referee extends Actor {

	private Collection<Report>		collectionReports;
	private Collection<Complaint>	collectionComplaints;


	@Valid
	@OneToMany
	public Collection<Report> getCollectionReports() {
		return this.collectionReports;
	}

	public void setCollectionReports(final Collection<Report> collectionReports) {
		this.collectionReports = collectionReports;
	}

	@Valid
	@OneToMany
	public Collection<Complaint> getCollectionComplaints() {
		return this.collectionComplaints;
	}

	public void setCollectionComplaints(final Collection<Complaint> collectionComplaints) {
		this.collectionComplaints = collectionComplaints;
	}

}
