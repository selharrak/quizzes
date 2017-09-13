/**
 * 
 */
package ma.aselharrak.quiz.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.aselharrak.quiz.core.service.QuizService;
import ma.aselharrak.quiz.dao.CrudDao;
import ma.aselharrak.quiz.dao.QuizDao;
import ma.aselharrak.quiz.dao.model.Quiz;

/**
 * @author AELHARRAK
 *
 */
@Service
public class QuizServiceImpl extends CrudServiceImpl<Quiz, Long> implements QuizService{
	
	@Autowired
	private QuizDao quizDao;

	@Override
	protected CrudDao<Quiz, Long> getDao() {
		return quizDao;
	}

}
