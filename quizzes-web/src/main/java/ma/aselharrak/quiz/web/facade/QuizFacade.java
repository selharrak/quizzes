package ma.aselharrak.quiz.web.facade;

import java.util.Set;

import ma.aselharrak.quiz.web.data.QuizData;
import ma.aselharrak.quiz.web.data.ReponseData;
import ma.aselharrak.quiz.web.data.TestData;

/**
 * 
 * @author AELHARRAK
 *
 */
public interface QuizFacade {
	
	public Set<QuizData> getAll();
	
	public Set<TestData> getTestsBy(final Long idQuiz);
	
}
