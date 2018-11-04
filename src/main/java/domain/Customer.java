
package domain;

import java.util.Collection;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Customer extends Endorser {

	//external attributes
	private Collection<FixUpTask>	fixUpTasks;


	@NotNull
	@Valid
	public Collection<FixUpTask> getFixUpTasks() {
		return this.fixUpTasks;
	}

	public void setFixUpTasks(final Collection<FixUpTask> fixUpTasks) {
		this.fixUpTasks = fixUpTasks;
	}

}
