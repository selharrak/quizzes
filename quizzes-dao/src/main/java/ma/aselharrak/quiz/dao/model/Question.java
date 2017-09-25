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
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String label;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	@Cascade({ CascadeType.SAVE_UPDATE, CascadeType.DELETE })
	private Set<TestQuestion> testQuestions;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "response")
	@Cascade({ CascadeType.SAVE_UPDATE, CascadeType.DELETE })
	private Set<QuestionResponse> questionResponses;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "level_id", nullable = false)
	private Level level;

	public Question() {
	}

	public Question(String label) {
		super();
		this.label = label;
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

	public Set<TestQuestion> getTestQuestions() {
		return testQuestions;
	}

	public void setTestQuestions(Set<TestQuestion> testQuestions) {
		this.testQuestions = testQuestions;
	}

	public Set<QuestionResponse> getQuestionResponses() {
		return questionResponses;
	}

	public void setQuestionResponses(Set<QuestionResponse> questionResponses) {
		this.questionResponses = questionResponses;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

}
