package ma.aselharrak.quiz.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author AELHARRAK
 *
 */
@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String question;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	private Set<TestQuestion> testQuestions;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "response")
	private Set<QuestionResponse> questionResponses;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "level_id", nullable = false)
	private Level level;

	public Question(String question) {
		super();
		this.question = question;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
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
