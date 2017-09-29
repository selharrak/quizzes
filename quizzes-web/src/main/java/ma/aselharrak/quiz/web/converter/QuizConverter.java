/**
 * 
 */
package ma.aselharrak.quiz.web.converter;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import ma.aselharrak.quiz.dao.model.Quiz;
import ma.aselharrak.quiz.web.data.QuizData;

/**
 * @author AELHARRAK
 *
 */
@Component
public class QuizConverter implements Converter<Quiz, QuizData> {

	@Override
	public QuizData convert(Quiz quiz) {
		QuizData quizData = new QuizData();
		quizData.setId(quiz.getId());
		quizData.setLabel(quiz.getLabel());
		quizData.setDescription(quiz.getDescription());
		quizData.setNbQuiz(quiz.getTests().size());
		return quizData;
	}

	public Set<QuizData> convert(final Collection<Quiz> quizzes) {
		final Set<QuizData> quizzesData = new HashSet<>();
		for (final Quiz quiz : quizzes)
			quizzesData.add(convert(quiz));
		return quizzesData;
	}

}
