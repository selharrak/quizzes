package ma.aselharrak.quiz.web.data;

import java.io.Serializable;
import java.util.Set;

import ma.aselharrak.quiz.dao.model.TestQuestion;

public class TestData implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private String label;
	private String description;
	private int duration;
	private int nbQuestion;
	private Set<TestQuestion> testQuestions;
	
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

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}
	
	public int getNbQuestion() {
		return nbQuestion;
	}
	public void setNbQuestion(int nbQuestion) {
		this.nbQuestion = nbQuestion;
	}

	public Set<TestQuestion> getTestQuestions() {
		return testQuestions;
	}

	public void setTestQuestions(Set<TestQuestion> testQuestions) {
		this.testQuestions = testQuestions;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
