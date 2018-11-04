
package domain;

import java.util.Collection;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class Category extends DomainEntity {

	// Atributos ---- 
	private String	name;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}


	// Relationships ----------------------------------------------------------

	private Category				fatherCategory;
	private Collection<Category>	childrenCategories;


	@Valid
	public Category getFatherCategory() {
		return this.fatherCategory;
	}

	public void setFatherCategory(final Category fatherCategory) {
		this.fatherCategory = fatherCategory;
	}
	@NotNull
	@Valid
	public Collection<Category> getChildrenCategories() {
		return this.childrenCategories;
	}

	public void setChildrenCategories(final Collection<Category> childrenCategories) {
		this.childrenCategories = childrenCategories;
	}

}
