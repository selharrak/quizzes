package ma.aselharrak.quiz.web.data;

import java.io.Serializable;

public class QuestionData implements Serializable {
	

	private static final long serialVersionUID = 1L;

	private Long id;
	private String label;
	
	public Long getId() {
		return id;
	}
	public String getLabel() {
		return label;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setLabel(String label) {
		this.label = label;
	}

}
