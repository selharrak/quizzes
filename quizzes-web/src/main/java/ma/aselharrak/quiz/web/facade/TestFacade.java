package ma.aselharrak.quiz.web.facade;

import java.util.Set;

import ma.aselharrak.quiz.web.data.QuizData;
import ma.aselharrak.quiz.web.data.TestData;

/**
 * 
 * @author AELHARRAK
 *
 */
public interface TestFacade {
	
	public Set<QuizData> getAll();
	
	public Set<TestData> getTestsById(final Long idQuiz);
	
}
