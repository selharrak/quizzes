/**
 * 
 */
package ma.aselharrak.quiz.web.facade.impl;

import java.util.Collection;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.aselharrak.quiz.core.service.QuizService;
import ma.aselharrak.quiz.dao.model.Quiz;
import ma.aselharrak.quiz.web.converter.QuizConverter;
import ma.aselharrak.quiz.web.converter.TestConverter;
import ma.aselharrak.quiz.web.data.QuizData;
import ma.aselharrak.quiz.web.data.TestData;
import ma.aselharrak.quiz.web.facade.QuizFacade;

/**
 * @author AELHARRAK
 *
 */
@Component
public class QuizFacadeImpl implements QuizFacade {

	@Autowired
	private QuizService quizService;

	@Autowired
	private QuizConverter quizConverter;
	@Autowired
	private TestConverter testConverter;
	
	
	@Override
	public Set<QuizData> getAll() {
		final Collection<Quiz> quizzes = quizService.getAll();
		final Set<QuizData> quizzesData = quizConverter.convert(quizzes);
		return quizzesData;
	}

	@Override
	public Set<TestData> getTestsBy(Long idQuiz) {
		final Quiz quiz = quizService.read(idQuiz);
		final Set<TestData> tests = testConverter.convert(quiz.getTests());
		return tests;
	}

	


	
	
}
