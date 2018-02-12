/**
 * 
 */
package ma.aselharrak.quiz.web.data;

import java.io.Serializable;

/**
 * @author AELHARRAK
 *
 */
public class QuizData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String label;
	private String description;
	private int numberOfTests;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public int getNumberOfTests() {
		return numberOfTests;
	}

	public void setNumberOfTests(int numberOfTests) {
		this.numberOfTests = numberOfTests;
	}

}
