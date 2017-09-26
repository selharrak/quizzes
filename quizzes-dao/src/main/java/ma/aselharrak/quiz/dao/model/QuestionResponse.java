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
public class QuestionResponse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "question_id", nullable = false)
	private Question question;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "response_id", nullable = false)
	private Response response;
	private boolean status;

	public QuestionResponse() {
	}

	public QuestionResponse(Question question, Response response, boolean status) {
		super();
		this.question = question;
		this.response = response;
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
