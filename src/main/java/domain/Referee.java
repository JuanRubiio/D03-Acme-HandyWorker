
package domain;

import java.util.Collection;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Referee extends Actor {

	private Collection<Report>		collectionReports;
	private Collection<Complaint>	collectionComplaints;


	@NotNull
	@Valid
	public Collection<Report> getCollectionReports() {
		return this.collectionReports;
	}

	public void setCollectionReports(final Collection<Report> collectionReports) {
		this.collectionReports = collectionReports;
	}

	@NotNull
	@Valid
	public Collection<Complaint> getCollectionComplaints() {
		return this.collectionComplaints;
	}

	public void setCollectionComplaints(final Collection<Complaint> collectionComplaints) {
		this.collectionComplaints = collectionComplaints;
	}

}
