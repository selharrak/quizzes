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
import ma.aselharrak.quiz.web.data.QuizData;
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
	
	
	@Override
	public Set<QuizData> getAllQuiz() {
		final Collection<Quiz> quizzes = quizService.getAll();
		final Set<QuizData> quizzesData = quizConverter.convert(quizzes);
		return quizzesData;
	}

}
