package ma.aselharrak.quiz.dao.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author AELHARRAK
 *
 */
@Entity
public class Quiz {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String label;
	private String description;
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "quiz")
	private Set<Test> tests;

	public Quiz() {}

	public Quiz(String label, String description) {
		this.label = label;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public String getLabel() {
		return label;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Set<Test> getTests() {
		return tests;
	}

	public void setTests(Set<Test> tests) {
		this.tests = tests;
	}

}
