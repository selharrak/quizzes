/**
 * 
 */
package ma.aselharrak.quiz.dao.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * @author AELHARRAK
 *
 */
@Entity
public class Test {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String label;
	private String description;
	private int duration;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "quiz_id", nullable = false)
	private Quiz quiz;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "test")
	@Cascade({ CascadeType.SAVE_UPDATE, CascadeType.DELETE })
	private Set<TestQuestion> testQuestions;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "test")
	@Cascade({ CascadeType.SAVE_UPDATE, CascadeType.DELETE })
	private Set<UserTest> userTests;
	
	public Test() {}

	public Test(String label, String description, int duration) {
		this.label = label;
		this.description = description;
		this.duration = duration;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public Set<TestQuestion> getTestQuestions() {
		return testQuestions;
	}

	public void setTestQuestions(Set<TestQuestion> testQuestions) {
		this.testQuestions = testQuestions;
	}

	public Set<UserTest> getUserTests() {
		return userTests;
	}

	public void setUserTests(Set<UserTest> userTests) {
		this.userTests = userTests;
	}

}
