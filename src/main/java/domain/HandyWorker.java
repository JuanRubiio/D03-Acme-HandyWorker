
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;



@Entity
@Access(AccessType.PROPERTY)
public class HandyWorker extends Endorser {

	//------Atributos---------
	private String	mark;


	//--------Getter & Setter------------
	@NotBlank
	public String getMark() {
		return this.mark;
	}

	public void setMark(final String mark) {
		this.mark = mark;
	}


	//---------Relationships--------------

	//private Collection<Tutorial>	tutorial;
	private Curriculum				curriculum;
	//private Collection<Finder>		finder;
	//private Collection<Application>		apply;

	@NotNull
	@Valid
	@OneToOne(optional=false)
	public Curriculum getCurriculum() {
		return this.curriculum;
	}

	public void setCurriculum(final Curriculum curriculum) {
		this.curriculum = curriculum;
	}

}
