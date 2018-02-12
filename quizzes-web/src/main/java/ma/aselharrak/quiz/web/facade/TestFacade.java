package ma.aselharrak.quiz.web.facade;

import java.util.Set;

import ma.aselharrak.quiz.web.data.TestData;

/**
 * 
 * @author SELHARRAK
 *
 */
public interface TestFacade {
	
	public Set<TestData> getAllTestForQuiz(final Long idQuiz);
	
}
