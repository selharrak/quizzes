package ma.aselharrak.quiz.dao.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author AELHARRAK
 *
 */
@Entity
public class TestQuestion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "test_id", nullable = false)
	private Test test;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "question_id", nullable = false)
	private Question question;

	public TestQuestion(Test test, Question question) {
		super();
		this.test = test;
		this.question = question;
	}

	public TestQuestion() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

}
