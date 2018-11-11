
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

@Entity
@Access(AccessType.PROPERTY)
public class Endorser extends Actor {

	// PREGUNTAR SOBRE ESTO, TE PIDE EL SET
	//	public Double getScore() {
	//		return null;
	//	}

}
